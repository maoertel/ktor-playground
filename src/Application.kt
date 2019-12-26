package de.moertel

import arrow.core.*
import arrow.core.extensions.fx
import arrow.fx.IO
import arrow.fx.extensions.fx
import com.mongodb.reactivestreams.client.Success
import com.typesafe.config.ConfigException
import de.moertel.data.user.UserRepository
import de.moertel.data.user.model.User
import de.moertel.data.user.model.UserNotFound
import de.moertel.data.user.model.UserPostBody
import de.moertel.data.user.repositories.UserRepositoryImpl
import de.moertel.database.Database
import io.ktor.application.Application
import io.ktor.application.ApplicationCall
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.gson.gson
import io.ktor.http.HttpStatusCode.Companion.BadRequest
import io.ktor.http.HttpStatusCode.Companion.InternalServerError
import io.ktor.http.HttpStatusCode.Companion.NotFound
import io.ktor.http.HttpStatusCode.Companion.OK
import io.ktor.request.receive
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.routing
import io.ktor.util.KtorExperimentalAPI
import io.ktor.util.pipeline.PipelineContext
import kotlinx.coroutines.async
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@KtorExperimentalAPI
@Suppress("unused")
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {

    val database = Database(KMongo.createClient().coroutine)
    val userRepository: UserRepository = UserRepositoryImpl(database.userCollection)

    install(ContentNegotiation) { gson() }

    routing {
        post("/users") {
            val (statusCode, message) = when (val userEither = Either.catch { call.receive<UserPostBody>() }) {
                is Either.Left -> BadRequest to "There was a problem with your post body."
                is Either.Right -> userEither.b.createIn(userRepository)
            }

            call.respond(statusCode, message)
        }
    }

    routing {
        get("/users/{id}") {
            val userId: Option<Int> = call.parameters["id"]?.toInt().toOption()
//            val foo = Option.fx {
//                val (userId) = call.parameters["id"]?.toInt().toOption()
//                val (user) = userRepository.queryUser(userId)
//                user
//            }

//            val bar = when (foo) {
//                is None -> TODO()
//                is Some<User> -> OK to foo
//            }

            val (statusCode, message) = when (val user = userRepository.queryUser(userId)) {
                is None -> NotFound to UserNotFound(message = "User with user id $userId not found")
                is Some<User> -> OK to user.t
            }

            call.respond(statusCode, message)
        }
    }

    suspend fun PipelineContext<Unit, ApplicationCall>.foo(
        userRepository: UserRepository
    ): Either<Throwable, Success> =
        Either.fx {
            val (userPostBody) = Either.catch { call.receive<UserPostBody>() }
            val (bar) = userRepository.createUser(userPostBody)
            bar
        }
}

private suspend fun UserPostBody.createIn(userRepository: UserRepository) =
    when (val successOpt = userRepository.createUser(this)) {
        is Either.Left -> InternalServerError to "Something went wrong"
        is Either.Right -> OK to successOpt.b
    }
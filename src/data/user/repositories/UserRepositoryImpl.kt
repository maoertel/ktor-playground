package de.moertel.data.user.repositories

import arrow.core.Either
import arrow.core.Option
import arrow.core.toOption
import com.mongodb.reactivestreams.client.Success
import de.moertel.data.user.UserRepository
import de.moertel.data.user.model.User
import de.moertel.data.user.model.UserPostBody
import org.litote.kmongo.coroutine.CoroutineCollection
import org.litote.kmongo.eq

class UserRepositoryImpl(private val userCollection: CoroutineCollection<User>) : UserRepository {

    override suspend fun createUser(user: UserPostBody): Either<Throwable, Success> =
        Either.catch {
            userCollection.insertOne(
                User(
                    id = 7,
                    firstName = user.firstName,
                    lastName = user.lastName,
                    address = user.address,
                    country = user.country,
                    zipCode = user.zipCode
                )
            )
        }

    override suspend fun queryUser(id: Int): Option<User> = userCollection.findOne(User::id eq id).toOption()

}
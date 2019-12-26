package de.moertel.data.user

import arrow.core.Either
import arrow.core.Option
import com.mongodb.reactivestreams.client.Success
import de.moertel.data.user.model.User
import de.moertel.data.user.model.UserPostBody

interface UserRepository {

    suspend fun createUser(user: UserPostBody): Either<Throwable, Success>

    suspend fun queryUser(id: Int): Option<User>

}
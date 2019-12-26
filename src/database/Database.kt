package de.moertel.database

import de.moertel.data.user.model.User
import org.litote.kmongo.coroutine.CoroutineClient
import org.litote.kmongo.coroutine.CoroutineCollection

class Database(mongoClient: CoroutineClient) {

    private val database = mongoClient.getDatabase("user_db") //normal java driver usage
    val userCollection: CoroutineCollection<User> = database.getCollection<User>()

}
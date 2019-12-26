package de.moertel.data.user.model

data class UserPostBody(
    val firstName: String,
    val lastName: String,
    val address: String,
    val country: String,
    val zipCode: String
)
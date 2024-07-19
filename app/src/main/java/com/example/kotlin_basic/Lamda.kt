package com.example.kotlin_basic

fun lamda () {
    var user = callApi("xzy", ::callback)
    print(user)

    var user1 = callApi("def", {
        userId ->
            UserDemo(userId, "Dang", 25)
    })
    println(user1)

    var user2 = callApi("ghk") {
            userId ->
            UserDemo(userId, "Dang", 25)
    }
    println(user2)

    var user3 = callApi("ghk") {
        UserDemo(it, "Dang", 25)
    }
    println(user3)
}

fun callback (userId: String) = UserDemo(userId, "Dang", 25)

data class UserDemo (val userId: String, val name: String, val age: Int)

fun callApi (userId: String, callback: (String) -> UserDemo) = callback(userId)


package com.example.kotlin_basic

fun OperatorOverloading () {
    var man = PurePerson("Dang")
    var girl = PurePerson("Dan")
    val res = man + girl
    println(res)
}

data class PurePerson (val name: String) {
    operator fun plus(p: PurePerson) = "BABY"
    operator fun inc() = PurePerson("INC")
}

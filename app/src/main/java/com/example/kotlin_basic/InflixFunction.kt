package com.example.kotlin_basic

fun InFlixFunction () {
    val number: Int = 100
    val result = number + 100
    val result1 = number cong 100
    val result2 = number tru 100
    val result3 = number nhan 100
    val result4 = number chia 10

    val map = mapOf<String, Int>(
        "key" to 1
    )
}

infix fun Int.cong(number: Int) = this + number // prefix value
infix fun Int.tru(number: Int) = this - number
infix fun Int.nhan(number: Int) = this * number
infix fun Int.chia(number: Int) = this / number
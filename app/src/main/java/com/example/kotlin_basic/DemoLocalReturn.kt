package com.example.kotlin_basic

fun DemoReturnLocal () {

}

fun printNumber() {
    val range = 0..20
    range.forEach {
        if (it == 9) return@forEach // like continue
        println(it)
    }
    range.forEach lap@ {
        if (it == 9) return@lap // like continue
        println(it)
    }
    println("End")
}
package com.example.kotlin_basic

fun lateInit() {
    val baby = MyBaby()
    baby.name = "hello"
    baby.showName()
}

class MyBaby {
    lateinit var name: String

    fun showName() {
        print(name)
    }
}
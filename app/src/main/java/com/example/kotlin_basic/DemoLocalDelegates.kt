package com.example.kotlin_basic

fun DemoLocalDelegates () {
    val age by lazy {
        123
    }

    println(age)  //123

    setName (){
        handler() // helloday
    }
}

fun handler() = "helloday"

fun setName (handler: () -> String) {
    val name by lazy{handler}
}
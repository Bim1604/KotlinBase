package com.example.kotlin_basic

fun  NullSafety() {
    //th1
//    var email:String = null
//    println(email)

//    //th2
//    var email:String = "dang"
//    email = null

    //th3
    var email : String? = null
    println(email?.length)
}
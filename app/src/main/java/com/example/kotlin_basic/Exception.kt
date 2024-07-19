package com.example.kotlin_basic

fun ExceptionDemo () {
    try {
        var float = 10 / (0..1).random()
        println(float)
    } catch (e : java.lang.Exception) {
        println(e.toString())
    } finally {
        println("DONE")
    }

    try {
        var number = parseIn("123a")
        println(number)
    } catch (e: Exception) {
        println(e.toString())
    }
    var result = try {
        var number = parseFloat(123)
        println(number)
        123
    } catch (e: CustomException) {
        println(e.toString())
        456
    }
    println(result)

    println("END")
}

fun parseIn(s : String) : Int = s.toInt()

fun parseFloat(s : Any) : Float {
    if (s is Int) {
        throw CustomException("Loi int")
    }
    val str = s as String
    return str.toFloat()
}

class CustomException(val msg : String) : Throwable(msg) {

}
package com.example.kotlin_basic

fun DemoLamdaExtension() {
    val stringBuilder = StringBuilder()
    stringBuilder.append("a")
    stringBuilder.append("b")
    stringBuilder.append("c")
    stringBuilder.append("d")
    println(stringBuilder.toString())

    var result = buildString {
        append("a")
        append("b")
        append("c")
    }
    println(result)

    stringBuilder.run {

    }

    stringBuilder.let {

    }
}

inline fun buildString(builder: StringBuilder.() -> Unit) : String{
    val stringBuilder = StringBuilder()
    stringBuilder.builder()
    return stringBuilder.toString()
}
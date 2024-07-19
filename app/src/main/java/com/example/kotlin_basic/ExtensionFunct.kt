package com.example.kotlin_basic

fun ExtensionFunction () {
    var password : String? = "1234"
    var result = password?.validatePass()
    println(result)

    var lib = Library()
    lib.anOtherFunc()
}

fun String.validatePass() : Boolean {
    if (this.isEmpty()) return false

    if (this.length > 6) {
        return true
    }

    return false
}

class Library {}

fun Library.anOtherFunc() {
    println("this")
}


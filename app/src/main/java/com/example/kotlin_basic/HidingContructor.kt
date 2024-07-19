package com.example.kotlin_basic

fun HidingConstructor () {
    Kotlin.run()
}

class Kotlin private constructor(){
    val name : String = "hello" // hide
    companion object {
        fun run() {

        }
    }

}
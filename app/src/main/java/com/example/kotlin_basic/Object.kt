package com.example.kotlin_basic

fun Object () {
    println(SingleTonKotlin.name)
    SingleTonKotlin.doSomething()

    println(Guru.PI) // public static final float PI = 3.14 trong java
    var guru1 = Guru.makeGuru1() // public static function
    var guru2 = Guru.makeGuru2()
}

class Guru {
    companion object Math {
        var PI : Double = 3.14

        fun doSomething () {

        }

        fun makeGuru1() = Guru

        fun makeGuru2() : Guru {
            return  Guru()
        }
    }


}

object SingleTonKotlin {
    var name: String = "Kotlin"

    fun doSomething () {

    }
}
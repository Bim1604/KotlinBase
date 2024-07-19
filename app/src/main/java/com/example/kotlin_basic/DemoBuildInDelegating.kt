package com.example.kotlin_basic

import kotlin.properties.Delegates

class Languge {
    var name: String by Delegates.observable("Java") {
        prop, old , new -> // giám sát sự thay đổi
            println("$old -> $new")
    }
    var age: Int by Delegates.vetoable(5) {
        prop, old , new -> new > 5 // thay đổi có điều kiện
    }


}

fun DemoBuildInDelegating () {
    var lang = Languge()
    lang.name = "Kotlin"
    lang.name = "second"

    println(lang.age)
    lang.age = 2
    println(lang.age)
    lang.age = 6
    println(lang.age)

}
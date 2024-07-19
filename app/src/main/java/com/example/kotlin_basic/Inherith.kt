package com.example.kotlin_basic

fun inheritance() {
    var dog = Dog()
    dog.talk()

    var cat = Cat(name = "Cat")
    cat.talk()
}

open class Animal (var name: String = "") {
    open fun talk() {

    }
}

class Dog : Animal () {
    init {
        this.name =  "Dog"
    }

    override fun talk() {
        println("GO GO")
        super.talk()
    }
}

class Cat : Animal {
    init {
        this.name = "Cat"
    }

    constructor(
        name: String
    ) : super (name)

    override fun talk() {
        println("Mew")
        super.talk()
    }
}

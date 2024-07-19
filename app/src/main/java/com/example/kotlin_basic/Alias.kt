package com.example.kotlin_basic

fun Aliases () {
    val email : Email = "hello 23"
    val node : Node = setOf()
    val nodeKey : NodeKey = mapOf()
}

fun handler(data: Int, handler: Handler) {
    handler(data)
}

typealias Email = String
typealias Node = Set<String>
typealias NodeKey = Map<String,Int>
typealias Handler = (Int) -> Unit


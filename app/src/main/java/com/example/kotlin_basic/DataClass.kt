package com.example.kotlin_basic

fun main () {
    // data class tự gen code object để sử dụng như trong java
    var book1 = BookObject(title = "Sách 1", author = "TDĐ", date = "16/04/2000")
    var book2 = BookObject(title = "Sách 1", author = "TDĐ", date = "16/04/2000")
    println(book1 == book2)
    println(book1.toString())


    var baby1 = Baby(name = "Đăng", age = 10)
    var baby2 = Baby(name = "Đăng", age = 10)
    println(baby1 == baby2)
    println(baby1.toString())
}

class Baby(val name : String, val age : Int)

data class BookObject (val title: String, val author: String, val date: String)


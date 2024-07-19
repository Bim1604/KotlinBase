package com.example.kotlin_basic

fun AbstractClass () {
    var book = BookRepoImpl()
    println(book.table)
    book.selectBookById()
    book.saveBook()
}

abstract class BookRepo {
    var table = "Book"

    abstract fun selectBookById()

    fun saveBook () {

    }
}

class BookRepoImpl : BookRepo() {

    override fun selectBookById() {
        println("Book = hihi")
    }

}
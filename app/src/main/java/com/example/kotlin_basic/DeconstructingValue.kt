package com.example.kotlin_basic

fun DeconstructingValue () {
    var video = Video(
        title = "Dang",
        link = "fb.com",
        des = "hehe"
    )

    val (title, link, des) = video
    println(title)
    println(link)
    println(des)

    var (position, salary) = Programmer("Mobile dev", 2000, 25)

    println(position)
    println(salary)
}

class Video(val title: String, val link: String, val des : String) {
    operator fun component1(): String = title
    operator fun component2(): String = link
    operator fun component3(): String = des

}

data class Programmer (val position: String, val salary : Int, val age: Int)
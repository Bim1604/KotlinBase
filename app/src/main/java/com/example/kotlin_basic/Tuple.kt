package com.example.kotlin_basic

fun Tuples () {
    var city = getCity()
    println(city)

    var country = getCountry()
    println(country.third)
}

fun getCity () : Pair<String, String> = Pair("HA NOI", "HN")
fun getCountry () : Triple<String, String, Int> = Triple("HA NOI", "HN", 84)
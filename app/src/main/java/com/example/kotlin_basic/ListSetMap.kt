package com.example.kotlin_basic

fun listSetMap () {
    // Collections: list, set, map (mutable, immutable)

    val listImmutable = listOf<Int>(1,2,3,4,5,6)
    println("============")
        var listImmutable2 = listImmutable.map {
            it * 2
        }.filter {
            it > 2
        }
    println(listImmutable2)
    println(listImmutable)
    println("============")

    var listMutable = mutableListOf<Int>(1,2,3,4,5)
    listMutable.add(8)

    println(listMutable)

    val set = setOf<Int>(1,2,2,3,3,4,4)
    println(set)

    var map = mutableMapOf<String, Int>(
        "key0" to 0,
        "key1" to 1,
        "key2" to 2
    )

    println(map)

    println("--------------------")

    var filterMap = map.filterKeys {
        it == "key0"
    }

    println(filterMap)
    // map, filter, flatMap

}

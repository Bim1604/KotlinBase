package com.example.kotlin_basic

fun loop () {
    // for while do while
    for (item in 1..10) {
        print("$item>")
    }
    println()
    for (item in 1 until 10) {
        print(item)
    }
    println()

    var number = 1..10
    for (item in number) {
        print(item)
    }
    println()

    for (item in 10 downTo 1) {
        print(item)
    }
    println()

    for (item in 1..10 step 2) {
        print(item)
    }
    println()

    // while
    var item: Int = 10
    while (item < 15) {
        print("$item ->")
        item++
    }

    println()

    var item1:Int = 10
    do {
        print("$item1 ->")
        item1++
    } while (item1 < 15)

    println()

    // loop
    loop@ for (i in 1..3) {
        for (j in 1 .. 5) {
            if (j > i) {
                break@loop // thoát ra vòng lặp cha. Nếu k có định danh chỉ thoát vòng lặp gọi nó
            }
        }
    }
}
package com.example.kotlin_basic

fun higherOrderFunc() {
    var result = calculator(1,2, ::execute)
    println(result)

    var result1 = calculator(3,4, fun(z,s : Int) : Int {
        return z + s
    })
    println(result1)
}

fun calculator(x: Int, y: Int, func: (Int, Int) -> Int) : Int {
    return func(x,y)
}

fun execute(x : Int,y : Int) : Int {
    return x + y
}
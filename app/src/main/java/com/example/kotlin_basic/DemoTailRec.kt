package com.example.kotlin_basic

fun DemoTailRect () {
    // Đệ quy
    println()
}

fun fibonacciV1(n : Int) : Int {
    if (n == 0 || n == 1) {
        return n
    }
    return fibonacciV1(n-1) + fibonacciV1(n -2)
}

tailrec fun fibonnaciV2(n: Int, a: Int = 0, b: Int = 1) : Int =
    when (n) {
        0 -> a
        1 -> b
        else -> fibonnaciV2(n - 1, b , a + b)
    }
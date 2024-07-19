package com.example.kotlin_basic

fun inlineFunction() {
    println("Start Program")
    // mỗi khi khai báo sẽ tốn cấp phát bộ nhớ k cần thiết -> Inline Function
    var total = sum (1,2) {
        x,y -> x + y
    }
    println(total)
    println("End Program")
}

inline fun sum (x: Int, y: Int, noinline action: (Int, Int) -> Int) = action(x,y)
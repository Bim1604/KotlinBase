package com.example.kotlin_basic

fun function() {
//    sum(4, 5)
//    println("sum: " + sum1(5, 5))

    val statusCode = callApi()
    if (statusCode != 400) {
        error("Bad Request")
        showErrorUI()
    }

    val sum = sum3(1,2,3,4,5,6,7)
    println("Sum: $sum")

    // Named Parameter
    showInfo(email ="dangvipro@gmail.com", fullName = "Dang")
}

fun callApi() = 400

fun showErrorUI() {
    println("ERROR UI")
}

fun demo() : Unit {
    println("void function")
}

fun getAge() : Int {
    return 25
}

fun sum(x : Int, y: Int) : Int {
    return x + y
}

fun error(msg: String) : Nothing {
    throw Exception(msg)
}

fun sum1(x: Int, y: Int) = x + y

// unlimited param
fun sum2(vararg ints: Int) : Int {
    var sum = 0
    for (i in ints) {
        sum += i
    }
    return sum
}

fun sum3(vararg ints: Int) : Int {
    var sum = sum2(*ints)
    return sum
}

// default, Named parameter
fun showInfo(email: String, fullName: String, age: Int = 20) {
    println(email)
    println(fullName)
    println(age)
}

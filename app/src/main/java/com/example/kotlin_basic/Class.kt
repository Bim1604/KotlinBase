package com.example.kotlin_basic

fun Class () {
    val student = Student()
    println()
    student.showInfo()

    println("----------")
    val customer = Customer(email = "dangvipro3@gmail.com")
//    customer.setEmail()
    customer.showInfoCustomer()

}

class Student : Person() {
    // props, method

    private var name : String = "Dang";
    private var age : Int = 25;

    fun showInfo() {
        println(this.name + this.age + fullName)

    }
}

class Customer (var name: String = "" , var phone: String = "") {
    private var email : String = ""

        set(newEmail) {
            email = newEmail + "<====>" + this.email
        }

        get() = field

    init {
        name = "Đại Đăng"
        phone = "0364909656"
    }

    constructor(email : String): this() {
        this.email = email
    }

    fun showInfoCustomer() {
        println(name)
        println(phone)
        println(email)
    }
}

open class Person {
   protected var fullName : String = ""

}
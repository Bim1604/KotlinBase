package com.example.kotlin_basic

fun EnumClass () {
    var enum = EnumDemo.PRODUCTION
    println(enum.toString())
    println(enum.name)
//    println(enum.ordinal)

    for (item in EnumDemo.values()) {
        println("$item - value = ${item.transform()}")
    }


}

enum class EnumDemo(val value1: Int) {
    PRODUCTION(100) {
        override fun transform(): String {
            return this.name.lowercase()
        }

        override fun toString(): String {
            return "hello ${value1}"
        }
                    },
    STUDENT(2) {
        override fun transform(): String {
            return this.name.lowercase()
        }
               },
    STAGING(3) {
        override fun transform(): String {
            return this.name.lowercase()
        }
    };

    abstract  fun transform() : String
}
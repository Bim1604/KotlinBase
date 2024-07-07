package com.example.kotlin_basic

fun TypeOfKotlin() {
    // Int, Long, Float, String, Hex, Binary, Char
    val age: Int = 10
    val long: Long = 10L
    val float: Float = 10.0F
    val hex: Int = 0xFF
    val binary:Int = 0xb11
    val char: Char = 'A'
    val string:String = "String"

    // demo String
    val str1: String = "toi la" + "dang"
    val mLines = """
           Toi
            La
            Dang
        """
    println(mLines)

    val ageString: String = "toi la $age"
    println(ageString)
}
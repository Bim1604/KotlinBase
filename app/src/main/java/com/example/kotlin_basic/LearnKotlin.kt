package com.example.kotlin_basic

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity

class LearnKotlin : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        variable()
        super.onCreate(savedInstanceState, persistentState)
    }

    private fun variable() {
        // mutable, immutable
        var email: String = "dang3@gmail.com" // mutable
        println(email)

        email = "kieu@gmail.com"
        println(email)
    }


}


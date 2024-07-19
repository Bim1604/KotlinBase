package com.example.kotlin_basic

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.kotlin_basic.databinding.ActivityMainBinding
import com.example.kotlin_basic.security.encryptPass
import com.example.kotlin_basic.security.genToken

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
private lateinit var binding: ActivityMainBinding

    private fun variable() {
        // mutable, immutable
        var email: String = "dang3@gmail.com" // mutable
        println(email)

        email = "bim@gmail.com"
        println(email)

        val name: String = "dang"
        println(name)

        val name2 = "damn"
    }



    private fun condition() {
        // if - else, when
        val number: Int = (1..100).random()
        println(number)
        val result = if (number % 2 == 0) {
            "$number is even"
        } else {
            "$number is odd"
        }
        println(result)
        // when <=> switch-case
        val status = when (number) {
            in 1..16 -> {
                "1 -> 16"
            }
            18 -> {
                "18"
            }
            in 19..100 -> {
                "19 -> 100"
            }
            else -> {
                "hi"
            }
        }
        println (status)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

     binding = ActivityMainBinding.inflate(layoutInflater)
     setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
//        function()
//        listSetMap()
//        Class()
//        main()
//        EnumClass()
//        inheritance()
//        AbstractClass()
//            InterfaceClass ()
//        Tuples()
//        DeconstructingValue()
//        lateInit()
//        sealedClass()
        higherOrderFunc()
    }


override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when(item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
    val navController = findNavController(R.id.nav_host_fragment_content_main)
    return navController.navigateUp(appBarConfiguration)
            || super.onSupportNavigateUp()
    }
}
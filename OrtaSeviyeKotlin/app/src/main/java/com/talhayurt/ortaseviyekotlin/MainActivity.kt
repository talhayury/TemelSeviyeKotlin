package com.talhayurt.ortaseviyekotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        println("------LAMBDA--------")

        val yazdigimiDondurLambda = {string : String-> println(string) }
        yazdigimiDondurLambda("lambda ilk deneme ")

        val carpmaIslemi = {x : Int,y : Int -> x*y}
        println(carpmaIslemi(3,4))

        val carpmaIslemiV2 :(Int,Int)->Int = {a,b->a*b}
        println(carpmaIslemiV2(5,3))
    }
}
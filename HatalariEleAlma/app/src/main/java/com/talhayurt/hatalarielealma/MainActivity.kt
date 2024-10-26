package com.talhayurt.hatalarielealma

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
        val sonuc = IntOrNullFonksiyonu("talha")
        val sonuc2 = IntOrNullFonksiyonu("11")
        println(sonuc)
        println(sonuc2)

    }

    fun IntOrNullFonksiyonu(str :String) : Int?{
        try {
            val numara = str.toInt()
            return numara
        }catch (e : Exception){
            e.printStackTrace()
        }
        return null
    }
}
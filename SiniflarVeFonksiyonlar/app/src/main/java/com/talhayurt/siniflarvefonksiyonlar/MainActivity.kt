package com.talhayurt.siniflarvefonksiyonlar

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var sayac =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        birinciFonksiyon()
        birinciFonksiyon()
        birinciFonksiyon()
        ikinciFonksiyon()
        cikarma(10,5)
        println(toplama(10,14))

        val batman = Superkahraman(30,"ahmet","pilot")
        println(batman.isim)
        //batman.yas=30
        //batman.isim="Ahmet"
        //batman.meslek="pilot"

        //nullability

        val kullanıcıGirdisi = "20"
        val kullanıcıGirdisiInt = kullanıcıGirdisi.toIntOrNull()
        if (kullanıcıGirdisiInt != null){
            println(kullanıcıGirdisiInt*2)

            // !! iki tane ünlem kullanmak ben yüzde yüz eminin bundan önceki null gelmeyecek demektir
        }


    }

    fun birinciFonksiyon(){
        sayac++
        println("birinci fonksiyon ${sayac} kez calistirildi")
    }

    fun ikinciFonksiyon(){
        println("ikinci fonksiyon calistirildi")
        println(sayac)
    }

    //girdi almak
    fun cikarma(a: Int, b: Int) {
        println(a - b)
    }

    //çıktı vermek
    fun toplama(a:Int,b:Int) :Int{
        return a+b
    }
}
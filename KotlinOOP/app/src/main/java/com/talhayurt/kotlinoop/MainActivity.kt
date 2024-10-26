package com.talhayurt.kotlinoop

import Kahraman
import MuhtesemKahraman
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import MuhtesemKahraman as MuhtesemKahraman1

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

        val atil = Sanatci("talha",20,"davul")
        println(atil.isim)
        atil.sarkiSoyle()
        val zeynep = Sanatci("zeynep",19,"gitar")
        zeynep.sarkiSoyle()

        //private
        //public
        //protected korunmuş
        //internal iç

        atil.turYazdir()

        //inheritance
        val superman = Kahraman("superman","ucmak")
        superman.run()

        val muhtesemKahraman = MuhtesemKahraman("batman","zengin olmak ")
        muhtesemKahraman.run()

        println("-----High Order Functions-----")
        val benimDizi = arrayListOf(1,2,4,6,7,9,11,14,45,75)
        val ondanKucukler = benimDizi.filter{ num -> num < 10}
        for (numara in ondanKucukler) {
            println(numara)
        }


        println("************************")
        //map
        val karesiAlinanSayilar =benimDizi.map { it*it }
        for (it in karesiAlinanSayilar){
            println(it)
        }

        //map$filter

        val mapFilterBirArada = benimDizi.filter { it<10 }.map { it*it }
        for (it in mapFilterBirArada){
            println(it)
        }

        //--------scope fonksiyonlari-----------
        println("--------scope fonksiyonlari-----------")
        var benimInteger : Int? = null
        benimInteger = 5
        benimInteger?.let {
            println(it)
        }

        val yeniInteger = benimInteger?.let {
            it+1
        }?:0

        println(yeniInteger)

    //.let ne işe yarıyor öğren ?
        //also ne öğren



    }
}
package com.talhayurt.calisanlar

import Calisanlar
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
        val calisan1 = Calisanlar("ahmet",17002,"yazilim",32)
        val calisan2 = Calisanlar("mehmet",170,"temizlik",12)
        val calisan3 = Calisanlar("ali ",5000,"mudur",10)
        val calisan4 = Calisanlar("alper",20000,"finans",32)
        val calisan5 = Calisanlar("kerem",30000,"ceo",42)
        val calisan6 = Calisanlar("talha",42000,"yazilim",32)
        val calisan7 = Calisanlar("hasan",38000,"caycı",52)
        val calisan8 = Calisanlar("fazli",60000,"yazilim",20)
        val calisan9 = Calisanlar("ayse",12000,"mudur yardimcisi",19)
        val calisan10 = Calisanlar("atil",18602,"yazilim",36)

        val calisanListesi = arrayListOf(calisan1,calisan2, calisan3,calisan4,calisan5,calisan6,calisan7,calisan8,calisan9,calisan10)

        val otuzdanBuyukYazilimci = calisanListesi.filter { it.yas > 30 && it.departman=="yazilim"}
        for(it in otuzdanBuyukYazilimci){
            println(it.maasGoster())
        }

        val yirmibestenKucuklerinIsmi = calisanListesi.filter { it.yas<25 }
        for (it in yirmibestenKucuklerinIsmi){
            println(it.isim)
        }


    }

}
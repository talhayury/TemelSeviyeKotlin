package com.talhayurt.myapp

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

        println("selamin aleyke ")
        println("aleykum sale")

        //yorum satiri
        //int = var
        var x = 10
        println(x)
        x=20

        //final = val
        val y =5
        //y=7 yazarsak hata verir çünkü val değer birdaha değiştirilemez

        println(x  + y)


        var a : Long =15//uzun sayilar icin
        var b :Int = 8//daha kisa sayilar icin

        println(a * b)
        //long>ınt>shor>byte
        //UInt = negatif değer alamaz demek

        //double>float

        //Stringler

        val ad = "talha"
        println(ad)

        val soyAd : String ="yurt"

        println(soyAd.uppercase())

        val yas = "15"

        val yasInt = yas.toInt()

        println(yasInt * 20)

        var myBool : Boolean = true
        myBool = false

        println(myBool)
        println(10==10)
        println(3>5)

        //array
        val stringOrn ="talha"

        val benimDizi = arrayOf(stringOrn,"yurt","ahmet","2022141058")
        println(benimDizi[0]+" "+benimDizi[1])
        println(benimDizi.last())//sonelemanıyazdirir
        benimDizi.reverse()//diziyi ters çevirir
        println(benimDizi.last())
        //dizilere sonradan eleman ekleme çıkarma yapılmaz
        println("-------------***-----------------------")
        //-----------------ArrayList---------
        val benimmDizi = arrayListOf("talha","baba","naptın")
        println(benimmDizi[0])

        benimmDizi.add("memati")
        benimmDizi.removeAt(0)
        println(benimmDizi.get(0))
        println(benimmDizi.get(2))

        val sayilar = arrayListOf<Int>()
        sayilar.add(10)
        sayilar.add(20)

        println(sayilar[0]*sayilar[1])

        val karisikBosListe = arrayListOf<Any>()
        karisikBosListe.add(10)
        karisikBosListe.add("ingilizce")
        karisikBosListe.add(false)

        println("---------set--------")
        //setler aynı elemanı iki kez tutmaz hafızasından siler
        val ornekSet = setOf(10,10,10,10,20,30,40)
        println(ornekSet.size)
        //SONRADAN EKLEME YAPILAMAZ

        ornekSet.forEach{
            println(it)
        }

        val bosSetOrnegi = HashSet<String>()
        bosSetOrnegi.add("fenerbahce")
        bosSetOrnegi.add("fenerbahce")
        bosSetOrnegi.add("fenerbahce")
        bosSetOrnegi.add("besiltas")

        bosSetOrnegi.forEach{
            println(it)
        }

        println("----------MAP------------")

        val yemekKalori = hashMapOf<String,Int>()

        yemekKalori.put("elma",100)
        yemekKalori.put("karpuz",150)
        yemekKalori.put("armut",200)
        yemekKalori.put("muz",170)

        println(yemekKalori["elma"])

        println("-------------if kontrolleri-------------")

        var skor = 10
        if(skor<0){
            println("skor 0 dan küçük olamaz ")
        }else if(skor<10){
            println("oyunu kaybettiniz")
        }else{
            println("kazandiniz")
        }

        println("---------when--------")

        val notRakam =2
        var notString=""

        when(notRakam){
            0 -> notString ="kaldiniz"
            1 -> notString ="zayıf"
            2 -> notString ="kotu"
            3 -> notString ="orta"
            4 -> notString ="iyi"
            5 -> notString ="pekiyi"
            else -> notString ="geçersiz not"
        }

        println(notString)

        println("----------while---------")

        var sayi = 0
        println("dongu basladi")
        while (sayi < 10){
            println(sayi)
            sayi++
        }
        println("dongu bitti")

        println("-----------for dongusu---------")

        val baskaDizi = arrayListOf(5,10,15,20,25)

        for (numara in baskaDizi){
            println(numara/5*3)
        }

        for (numara in 0..9){
            println(numara*10)
        }





    }
}
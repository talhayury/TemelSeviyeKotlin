package com.talhayurt.kotlinoop

class Sanatci(var isim:String , var yas:Int , var enstruman:String) {

    fun sarkiSoyle(){
        println("su sarkici soyledi:${this.isim}")
    }

    private var tur ="insan"

    fun turYazdir(){
        println(tur)
    }
}
package com.aysebeyzagur.kotlindersleri.collections

fun main() {
    //Tanımlama
    val meyveler = ArrayList<String>()

    //Veri Eklemeler
    meyveler.add("Elma")
    meyveler.add("Kiraz")
    meyveler.add("Karpuz")
    println(meyveler)

    //Güncelleme
    meyveler[0] = "Vişne"
    println(meyveler)

    //Insert : istediğimiz bir indexe
    meyveler.add(1,"Portakal")
    println(meyveler)

    //Okuma
    val m = meyveler.get(3)
    println(m)

    println("Boyut : ${meyveler.size}")
    meyveler.reverse()
    println(meyveler)

    for (meyve in meyveler){
        println("Sonuç : $meyve")
    }

    for ((index,meyve) in meyveler.withIndex()){ //Swift -> Enumarated
        println("$index. -> $meyve")
    }

    meyveler.removeAt(1)
    println(meyveler)

    meyveler.clear()
    println(meyveler)
}
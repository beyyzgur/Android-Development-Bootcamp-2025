package com.aysebeyzagur.kotlindersleri.collections

fun main() {
    // HASHSET
    // Tanımlama
    val meyveler = HashSet<String>()
    // Any en üst sınıf demektir ve bütün türleri kapsar.
    // Javada -> Object

    meyveler.add("elma")
    meyveler.add("muz")
    meyveler.add("kiraz")
    println(meyveler)

    meyveler.add("karpuz")
    println(meyveler)

    val y = meyveler.elementAt(2)
    println(y)

    println("Boyut : ${meyveler.size}")

    for (meyve in meyveler){
        println("Sonuç : $meyve")
    }

    for ((index,meyve) in meyveler.withIndex()){ //Swift -> Enumarated
        println("$index. -> $meyve")
    }

    meyveler.remove("elma")
    println(meyveler)

    meyveler.clear()
    println(meyveler)
}
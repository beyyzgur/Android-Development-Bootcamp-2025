package com.aysebeyzagur.kotlindersleri.degiskenler

fun main () {
    val id = 1
    var ad = "Mont"
    var resim = "mont.png"
    var puan = 4.7
    var fiyat = 4500
    var stokDurum = true

    println("Id : $id")
    println("Ad : $ad")
    println("Resim : $resim")
    println("Puan : $puan")
    println("Fiyat : $fiyat")
    println("Stok Durumu : $stokDurum")

    // Sabitler - Constant
    var sayi = 30
    sayi = 100
    println(sayi)

    val numara = 50
    println(numara)
    // performans açısından val kullanman daha iyi.

    // Tür Dönüşümü
    // 1 - Sayısaldan Sayısala Dönüşüm

    val d = 89.56
    val sonuc1 = d.toInt()
    println(sonuc1)

    val i = 34
    val sonuc2 = i.toDouble()
    println(sonuc2)

    // 2 - Sayısaldan Metine Dönüşüm
    var x = 85
    val sonuc3 = x.toString()
    println(sonuc3)

    // 3 - Metinden Sayısala Dönüşüm
    val yazi = "48t"
    val sonuc4 = yazi.toIntOrNull()
    println(sonuc4)

    if (sonuc4 != null) {
        println(sonuc4)
    } else {
        println("sonuc null'dur")
    }








}
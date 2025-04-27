package com.aysebeyzagur.kotlindersleri

fun main() {
    // 1. Compile Error : Kodlama yaparken oluşur
    //val sayi = 100
    //sayi = 500

    // 2. Runtime Error (Exceptions)
    //Çalışma sırasında olur - uygulama çalışırken uygulamam çöker
    val x = 10
    val y = 0

    // iki noktadan sonra hatayı zaten söylüyor oraya bakabilirsin

    try {
        println("Sonuç : ${x/y}")
        println("İşlem Tamamlandı.")
    }catch (e:Exception) { // Birden fazla catch kullanabilirsin, hangi hatayı alırsan o catche fırlar.
        println("ikinci sayı 0 olamaz.")
    } //Veritabanı kısmında çözemediğimiz hatalar için vs kullan try catch.w
}
package com.aysebeyzagur.kotlindersleri.nesne_tabanli_programlama

fun main() {
    // Nesne oluşturma
    val y1 = Yemekler(100,"Köfte",249)
    // Deger Okuma
    y1.bilgiAl()
    //Deger atama - değiştirme
    y1.fiyat = 350
    y1.bilgiAl()

    val y2 = Yemekler(200,"Baklava",300)
    y2.bilgiAl()

    y2.ad = "Soğuk baklava"
    y2.bilgiAl()
}
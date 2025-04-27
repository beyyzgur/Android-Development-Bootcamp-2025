package com.aysebeyzagur.kotlindersleri.nesne_tabanli_programlama

fun main() {
    ucretHesapla(KonserveBoyut.ORTA, adet = 55)
}

fun ucretHesapla(boyut: KonserveBoyut, adet: Int) {
    when(boyut) {
        KonserveBoyut.KUCUK -> println("Ücret: ${ adet * 104 } ")
        KonserveBoyut.ORTA -> println("Ücret: ${ adet * 207 } ")
        KonserveBoyut.BUYUK -> println("Ücret: ${ adet * 309 } ")
    }
}
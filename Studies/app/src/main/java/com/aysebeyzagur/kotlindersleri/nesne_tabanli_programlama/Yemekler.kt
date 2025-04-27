package com.aysebeyzagur.kotlindersleri.nesne_tabanli_programlama

data class Yemekler(var id:Int, var ad:String,var fiyat:Int) {
    // kotlin modern bir dil oldugu  için  set get setter getter kullanmamıza gerek yok
    // data yazdığın zaman set get vs(toString,hashCode,equals) yazmaya gerek kalmıyor.
    // Constructor - init() fonksiyonu
    //Bu sınıftan nesne oluşturulduğunda çalışır.
    init {
        println("*****nesne oluştu*****")
    }

    fun bilgiAl(){
        println("-----------------")
        println("Id          : ${id}")
        println("Ad          : ${ad}")
        println("Fiyat       : ${fiyat}")
    }
    // this : Bulundugu sınıfı temsil eder. Swift dilinde -> self
    // super : Kalıtım ile bir üst sınıfı temsil eder.
}
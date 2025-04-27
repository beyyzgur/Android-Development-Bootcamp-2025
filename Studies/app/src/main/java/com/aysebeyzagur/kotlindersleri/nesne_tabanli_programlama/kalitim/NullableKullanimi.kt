package com.aysebeyzagur.kotlindersleri.nesne_tabanli_programlama.kalitim

fun main() {
    //Nullable, Null, Safety, Optional (Swift)
    //Genellikle mobil uygulama geliştirme dillerinde yer almaktadir.
    //null,NaN,nil

    var mesaj: String? = null
    mesaj = "Merhabaa"

    //Yöntem-1
    //sorun yoksa çalışır, sorun varsa uygulama çökmez
    println("Yöntem 1 : ${mesaj.uppercase()}")

    val x = mesaj.uppercase()

    //Yöntem-2
    //sorun yoksa çalışır, sorun varsa uygulama çöker
    // Çok emin olduğunuz kodlarda kullanabilirsiniz.
    println("Yöntem 2 : ${mesaj.uppercase()}")

    //Yöntem-3
    //null kontrol
    if (mesaj != null) {
        println("Yöntem 3 : ${mesaj.uppercase()}")
    }else {
        println("Değişkende null yer almaktadır.")
    }

    mesaj?.let {
        println("Yöntem 3 : ${mesaj.uppercase()}")
    }
}
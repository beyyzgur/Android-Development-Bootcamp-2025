package com.aysebeyzagur.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val a = ClassA()

    // Standart nesne tabanlı erişim
    //println(a.x)
    //a.metod()

    // Sanal Nesne _ Virtual Object - Nameless (İsimsiz) Object
    //println(ClassA().x)
    //ClassA().metod()

    //Static Kullanımı - // bu nesne değil, arka tarafta nesneye benzer bir erişim yapısı oluşturuyoruz,
    // büyük projelerde düzenli kullanımda performansa faydalı olabilir.
    println(ClassA.x)
    ClassA.metod()
}
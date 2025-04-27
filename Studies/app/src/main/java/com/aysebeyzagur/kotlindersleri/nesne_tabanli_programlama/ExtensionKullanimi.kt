package com.aysebeyzagur.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val sonuc = 5 carp 2 //5.carp(2)
    println(sonuc)
} // 5, bastaki Int demek

infix fun Int.carp(sayi:Int) : Int {
    return this * sayi //this(Int)
}
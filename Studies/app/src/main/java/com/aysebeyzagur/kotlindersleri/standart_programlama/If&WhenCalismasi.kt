package com.aysebeyzagur.kotlindersleri.standart_programlama

fun main() {
    val yas = 19

    if (yas >= 18) {
        println("Reşitsiniz.")
    } else {
        println("Reşit değilsiniz.")
    }

    val ka = "admin"
    val s = 123456
    val sayi = 10

    if(ka == "admin" && s == 123456) { // && = And (Ve), true&&true ise true olur, diğer durumlarda false olur.
        println("Hoşgeldiniz")
    }else {
        println("Hatalı giriş")
    }

    if(sayi == 9 || sayi == 10){ // || = Or (Veya), false || false ise false olur, diğer durumlarda true olur.
        println("sayı 9 veya 10'dur.")
    }else {
        println("sayı 9 veya 10 değildir.")
    }

    //When
    val number = 2
    when(number) {
        1 -> println("sayi 1dir")
        2-> println("sayi 2dir")
        else -> println("tanimlanmayan sayi")
    }

}
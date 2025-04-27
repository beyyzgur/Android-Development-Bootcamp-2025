package com.aysebeyzagur.kotlindersleri.collections

import androidx.core.os.registerForAllProfilingResults

fun main() {
    val f1 = Filmler(1, "Interstellar", 50)
    val f2 = Filmler(2, "Neşeli Hayatlar", 30)
    val f3 = Filmler(3, "Kış Uykusu", 80)

    val filmlerListesi = ArrayList<Filmler>()
    filmlerListesi.add(f1)
    filmlerListesi.add(f2)
    filmlerListesi.add(f3)

    for (film in filmlerListesi){
        println("-------------------")
        println("${film.id} : ${film.ad} : ${film.fiyat}")
    }

    //Sıralama - Sorting
    println("------- Fiyata Göre Artan -------")
    val siralama1 = filmlerListesi.sortedWith(compareBy{ it.fiyat }) //FİYATA GÖRE ARTAN FİYATA GÖRE AZALAN - FİYAT ARALIGI FİLTRELEMESİ
    for (film in siralama1){
        println("-------------------")
        println("${film.id} : ${film.ad} : ${film.fiyat}")
    }

    println("------- Azalan -------")
    val siralama2 = filmlerListesi.sortedWith(compareByDescending{ it.ad }) //Ada göre ters
    for (film in siralama2){
        println("-------------------")
        println("${film.id} : ${film.ad} : ${film.fiyat}")
    }

    //Filtreleme - bir arrayden veya veri kümesinen isteidğimiz kadarını alacağız
    println("---------- Filtreleme 1 -----------")
    val filtreleme1 = filmlerListesi.filter { it.fiyat > 40 }
    for (film in filtreleme1){
        println("${film.id} : ${film.ad} : ${film.fiyat}")
    }

    println("---------- Filtreleme 2 -----------")
    val filtreleme2 = filmlerListesi.filter { it.ad.contains("at") }
    for (film in filtreleme2){
        println("${film.id} : ${film.ad} : ${film.fiyat}")
    }

}


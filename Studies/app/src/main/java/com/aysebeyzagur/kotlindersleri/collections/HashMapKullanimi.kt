package com.aysebeyzagur.kotlindersleri.collections

fun main() {
    // HashMap JSON veri modeline benzemektedir. Key - Value ilişkisini burda daha net görürsün.
    // Swift -> Dictionary
    // Shared Preferences, DataStore,UserDefault (Swift) benziyor.

    val iller = HashMap<Int,String>()

    iller.put(16,"Bursa")
    iller[34] = "İstanbul"
    iller[6] = "Ankara"
    println(iller)

    iller[16] = "Yeni Bursa"
    println(iller)

    val il = iller[6]
    println(il)

    println("Boyut : ${iller.size}")

    for((anahtar,deger)in iller){
        println("$anahtar -> $deger")
    }

    iller.remove(34)
    println(iller)

    iller.clear()
    println(iller)
}
package com.aysebeyzagur.kotlindersleri.standart_programlama

fun main() {
    // 1, 2, 3
    for(i in 1 .. 3) { // Swift 1...3, i = index
        println("Döngü 1: $i")
    }

    // 10 ile 20, 5 er artın
    for(x in 10..20 step 5) {
        println("Döngü 2: $x")
    }
    // 20 ile 10, 5 er azalsın
    for(x in 20 downTo 10 step 5) {
        println("Döngü 3: $x")
    }
    // 1, 2, 3
    var sayac = 1

    while (sayac < 4) {
        println("Döngü 4: $sayac")
        sayac+=1 //sayac++
    }

    // 1 2 3 4 5
    for (i in 1..5 ) {
        if(i == 3){
            break // döngüyü durdurur
        }
        println("Döngü 5: $i")
    }

    for (i in 1..5 ) {
        if(i == 3){
            continue // bulundugu adımı pas gecer
        }
        println("Döngü 6: $i")
    }
}
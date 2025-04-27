package com.aysebeyzagur.kotlindersleri.nesne_tabanli_programlama

// 1. Dereceyi Fahrenheit'a dönüştüren metod
fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 1.8 + 32
}

// 2. Dikdörtgenin çevresini hesaplayan metod
fun rectanglePerimeter(length: Double, width: Double): Double {
    return 2 * (length + width)
}

// 3. Sayının faktöriyelini hesaplayan metod
fun factorial(number: Int): Long {
    var result = 1L
    for (i in 1..number) {
        result *= i
    }
    return result
}

// 4. Kelime içinde kaç adet 'a' harfi olduğunu bulan metod
fun countLetterA(word: String): Int {
    return word.count { it == 'a' || it == 'A' }
}

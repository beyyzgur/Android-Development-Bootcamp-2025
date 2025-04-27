package com.aysebeyzagur.kotlindersleri.nesne_tabanli_programlama.kalitim

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()

    hayvan.sesCikar() // Kalıtım yok kendi metoduna eristi
    memeli.sesCikar() // Kalıtım var, bir üst sınıfın metotuna erişti
    kedi.sesCikar() // Kalıtım var, kendi metotuna erişti
    kopek.sesCikar() // Kalıtım var, kendi metotuna erişti
}
//Nesneler arasında dönüşüm yapmak istiyorsak kalıtım ilişkisi olmak zorunda !!!
//DownCasting (%90 bu kullanılır, önemlidir!!! - as keywordu kullanılır (? koydugunda nil de olabilir uygulama çökmez)) - UpCasting
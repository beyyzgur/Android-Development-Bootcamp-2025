package com.aysebeyzagur.kotlindersleri.nesne_tabanli_programlama.kalitim

class Kedi : Memeli() {
    override fun sesCikar() {
       // super.sesCikar() -> super : Kalıtım ile üst sınıfı (superclass'ı) temsil eder.
        println("Miaww")
    }
}
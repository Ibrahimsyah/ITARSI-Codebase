package inheritance

open class Animal (private val tipe: String, private val jumlahKaki: Int){
    open fun jalan() {
        println("Hewan sedang berjalan")
    }
}
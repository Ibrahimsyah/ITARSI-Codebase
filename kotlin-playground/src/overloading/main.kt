package overloading

// Konsep: Nama fungsi bisa sama, dengan beberapa syarat
// 1. Jumlah params berbeda
// 2. Jika jumlah params sama, tipe data params harus berbeda
class Kucing (val ras: String) {
    fun makan() {
        println("Kucing sedang makan")
    }

    fun makan(makanan : String) {
        println("Kucing sedang makan $makanan")
    }

    fun makan(berat: Int) {
        println("Kucing makan makanan seberat $berat gram")
    }
}

fun main () {
    val kucing = Kucing("Anggora")
    kucing.makan()
    kucing.makan("Rujak")
    kucing.makan(30)
}
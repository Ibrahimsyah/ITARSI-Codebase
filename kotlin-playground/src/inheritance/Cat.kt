package inheritance

class Cat(tipe: String, jumlahKaki: Int, val ras: String) : Animal(tipe, jumlahKaki), MakhlukHidup {
    companion object {
        const val RAS_BENGAL = "bengal"
        val RAS_ANGGORA = "anggora"
    }

    fun makan() {
        println("Kucing sedang makan")
    }

    override fun jalan() {
        println("Kucing sedang berjalan")
    }

    override fun bernafas() {
        println("Kucing sedang bernafas")
    }

    override fun tumbuh() {
        println("Kucing sedang tumbuh")
    }
}

fun main () {
    val cat = Cat("Vertebrata", 4, Cat.RAS_BENGAL)
    cat.makan()
    cat.jalan()
    cat.bernafas()
    cat.tumbuh()

    println(cat.ras)
}
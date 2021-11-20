package challenge

open class Kendaraan(val mesin: Mesin) {
    val penumpang: MutableList<Manusia> = mutableListOf()

    open fun berjalan() {
        println("Kendaraan sedang berjalan")
    }

    fun tambahPenumpang(penumpang: Manusia) {
        if (this.penumpang.size == 6) {
            println("Kursi sudah penuh")
        }else{
            this.penumpang.add(penumpang)
            println("Penumpang berhasil ditambahkan")
        }
    }

    fun kurangiPenumpang(nomorKursi: Int) {
        if(nomorKursi <= this.penumpang.size - 1){
            this.penumpang.removeAt(nomorKursi)
            println("Penumpang berhasil dikurangi")
        }else{
            println("Kursi nomor $nomorKursi kosong!")
        }
    }

    fun info() {
        println("""
            Bahan bakar: ${mesin.bahanBakar}
            Kapasitas mesin: ${mesin.kapasitas}
            Jumlah penumpang: ${penumpang.size}
        """.trimIndent())
    }
}
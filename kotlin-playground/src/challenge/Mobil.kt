package challenge

class Mobil(mesin: Mesin) : Kendaraan(mesin) {
    override fun berjalan() {
        println("Mobil sedang berjalan")
    }
}
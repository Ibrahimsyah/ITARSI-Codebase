package constructor

class Mesin (
    val jumlahPiston: Int,
    val kapasitas: Int
){
    fun bekerja() {
        println("Mesin dengan jumlah piston $jumlahPiston sedang bekerja")
    }
}

class Car (val mesin: Mesin) {
    var warna : String = "Hitam"
    var type : String = "SUV"

    fun cetakInfo() {
        print("""
        	-------------------------------
            Info Mobil
            Warna: $warna
            Tipe: $type
            Kapasitas mesin: ${mesin.kapasitas} CC
            -------------------------------
        """)
    }

    fun berjalan() {
        println("Mobil sedang berjalan")
        mesin.bekerja()
    }
}

fun main() {
    val engine: Mesin = Mesin(8, 2400)
    val mesinRumput = Mesin(1, 125)
    val mobil : Car = Car(engine)
    mobil.cetakInfo()

    mobil.warna = "Merah"
    mobil.type = "Sedan"
    mobil.cetakInfo()

    mobil.berjalan()
}
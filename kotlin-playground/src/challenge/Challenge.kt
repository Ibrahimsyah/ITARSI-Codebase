package challenge

fun main() {
    val mesin = Mesin(2000, "Solar")
    val mobil = Mobil(mesin)
    mobil.info()

    val penumpang1 = Manusia("Ibrahim", 20, 'L')
    mobil.tambahPenumpang(penumpang1)
    mobil.info()

    mobil.tambahPenumpang(Manusia("Him", 19, 'P'))
    mobil.info()

    mobil.tambahPenumpang(Manusia("Him", 19, 'P'))
    mobil.tambahPenumpang(Manusia("Him", 19, 'P'))
    mobil.tambahPenumpang(Manusia("Him", 19, 'P'))
    mobil.tambahPenumpang(Manusia("Him", 19, 'P'))

    // Ekspektasi: Error karena kursi sudah penuh
    mobil.tambahPenumpang(Manusia("Him", 19, 'P'))
    mobil.info()

    mobil.kurangiPenumpang(2)
    mobil.info()

    // Ekspektasi: Error karena nomor kursi melebihi index maksimal penumpang
    mobil.kurangiPenumpang(6)
}
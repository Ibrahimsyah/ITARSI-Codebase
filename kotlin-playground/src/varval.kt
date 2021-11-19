fun main() {
    val angka = 2 // Tidak bisa di ubah
    var umur = 25 // Bisa di ubah

    println(angka)
    println(umur)

    umur = 30 // Bisa di ubah

    println(angka)
    println(umur)

    var suatuArray = arrayOf<Int>(1, 3, 4, 6, 10)
    var arrayNama = arrayOf<String>("Ibrahim", "Him", "Ibra")
    println(suatuArray[2])
    println(arrayNama[0])

    var namaOrang : String? = null
    println(namaOrang)

    namaOrang = "Arif"
    var umurOrang = 20
    println("Nama orang itu adalah $namaOrang berumur $umurOrang tahun")

    var sebuahString : String? = null
    var panjangString = sebuahString?.length ?: 10
    println("Panjang String adalah $panjangString")

    var sebuahString2 : String? = null
    sebuahString2?.let {
        println(it)
    }

    var mendung = false
    var siang = true

    var mendungDanSiang = mendung && siang
    var mendungAtauSiang = mendung || siang
    var tidakMendung = !mendung

    println(mendung)
    println(siang)
    println(mendungDanSiang)
    println(mendungAtauSiang)
    println(tidakMendung)
}
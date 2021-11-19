fun main(){
    var hujan = true
    if (hujan) {
        println("Waduh hujan nih")
    } else {
        println("yes tidak hujan")
    }


    var mendung = false
    var siang = true
    if (!mendung && siang){
        println("Yuk main")
    } else {
        println("Yahh")
    }

    var umur = 15
    when(umur){
        17 -> println("17 tahun")
        18 -> println("18 tahun")
        19 -> println("19 tahun")
        else -> println("umur tidak memenuhi syarat")
    }

    if(umur < 18){
        println("Tidak diijinkan")
    }
}
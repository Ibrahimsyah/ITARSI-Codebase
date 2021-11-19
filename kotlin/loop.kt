fun main () {
    //Cetak nama 10 kali
    var counter = 1
    while(counter <= 10){
        println("Ibrahim")
        counter = counter + 1
    }
    println("Selesai")

    val ranges = 1.rangeTo(10)
    for(i in ranges){
        println("Halo, Ibrahim ke $i")
    }
    println("Selesai lagi")

    val array = arrayOf(1, 3, 5, 7)
    for(i in array){
        println("Ganjil: $i")
    }
    println("Selesai lagi")

    val rangeDown = 10.downTo(1)
    for(i in rangeDown){
        println("down: $i")
    }
    println("Selesai lagi")

    val listOfInt = arrayOf(1, 2, 3, null, 5, null, 7)
    // 1. Hilangkan null
    // 2. Print hanya sampai 5
    for(i in listOfInt){
        if(i == null) continue
        println(i)
        if(i == 5) break
    }
}
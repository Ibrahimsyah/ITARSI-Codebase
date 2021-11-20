package classes

class Kucing(
    val ras: String,
    val umur: Int,
    private val kelamin: Char
) {
    // Behavior object
    // Kucing bisa makan
    fun makan(){
        println("Kucing sedang makan")
    }

    // Kucing bisa tidur
    fun tidur(){
        println("Kucing sedang tidur")
    }

    // Kucing bisa bergerak
    fun bergerak(langkah: Int){
        println("Kucing bergerak sebanyak $langkah langkah")
    }

    fun getKelaminKucing() : String{
        var kelamin : String

        if(this.kelamin == 'J'){
            kelamin = "Jantan"
        }else {
            kelamin = "Betina"
        }

        return kelamin
    }
}

fun main() {
    val kucing = Kucing("Bengal", 2, 'J')
    kucing.makan()
    kucing.tidur()
    kucing.bergerak(20)

    println(kucing.getKelaminKucing())
}
data class User (
    val username: String? = null,
    val fullName: String = "",
    val age: Int = 0
)

data class Kucing (
    val berat: Int,
    val ras: String
)

fun main() {
    val pengguna: User = User("him", "Ibrahimsyah Zairussalam", 20)
    println(pengguna)

    val pengguna1 = User(age=20, fullName="Ibrahimsyah")
    println(pengguna1)

    val kucing = Kucing(20, "Anggora")
    println(kucing)
}
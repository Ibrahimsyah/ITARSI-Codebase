data class User1 (
    val username: String? = null,
    var fullName: String = "",
    val age: Int = 0
)

fun main() {
    val pengguna: User1 = User1("him", "Ibrahimsyah Zairussalam", 20)
    val namaLengkapUser = pengguna.fullName // Getter
    println("Nama lengkap user adalah $namaLengkapUser")

    pengguna.fullName = "Zairussalam Ibrahimsyah" // Setter
    println("Nama lengkap user yang baru adalah ${pengguna.fullName}") // Getter

    pengguna.fullName = "Zairussalam" // Setter
    println("Nama lengkap user yang baru adalah ${pengguna.fullName}") // Getter
}
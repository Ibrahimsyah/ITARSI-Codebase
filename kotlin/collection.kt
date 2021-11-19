fun main() {
    val array = arrayOf(1, 2, 3, 4, 4, 5, 6)
    println(array)

    val list = mutableListOf(1, 2, 3, 4, 4, 5, 6)
    println(list)
    list.add(2)
    list.removeAt(4)
    println(list)

    val aSet = setOf(1, 2, 3 , 4, 4, 5, 6, 6, 7)
    println(aSet)

    val aMap = mapOf(
        "Jawa Timur" to "Surabaya",
        "Jawa Tengah" to "Semarang"
    )
    println(aMap)


    val anotherList = listOf(1, 3, 5, 7)
    println(anotherList)

    val mappedList = anotherList.map { angka -> angka*angka }
    println(mappedList)

    val filteredList = anotherList.filter { it < 6 }
    println(filteredList)

    val descendingList = anotherList.sortedDescending()
    println(descendingList)

    val ascendingList = anotherList.sorted()
    println(ascendingList)
}
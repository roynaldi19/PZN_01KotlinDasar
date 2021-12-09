package `15ForLoop`

fun main() {
    val names = arrayOf("Roy", "Naldi", "Kidd")

    var total = 0

    for (nama in names) {
        println(nama)
        total++
    }
    println("total perulangan = $total")

}
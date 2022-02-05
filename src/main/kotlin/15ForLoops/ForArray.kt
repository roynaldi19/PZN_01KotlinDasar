package `15ForLoops`

fun main() {
    val names = arrayOf("Roy", "Naldi", "Kidd")
    var total = 0

    for (name in names) {
        println(name)
        total++
    }
    println("total perulangan = $total")

}
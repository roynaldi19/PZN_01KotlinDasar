package `24FunctionReturnType`

fun bagi(angka1: Int, angka2: Int): Int {
    if (angka2 == 0) {
        return 0

    } else {
        val total = angka1 / angka2
        return total
    }
}

fun main() {
    val hasil = bagi(200, 3)
    val hasil2 = bagi (10, 0)
    println(hasil)
    println(hasil2)
}
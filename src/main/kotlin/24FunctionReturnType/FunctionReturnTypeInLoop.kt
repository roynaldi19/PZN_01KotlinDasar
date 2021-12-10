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
    println(hasil)
}
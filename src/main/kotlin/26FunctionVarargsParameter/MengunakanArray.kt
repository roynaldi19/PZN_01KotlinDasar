package `26FunctionVarargsParameter`

fun hitungTotal(values: ArrayList<Int>): Int {
    var total = 0

    for (value in values) {
        total += value
    }
    return total
}

fun main() {
    val values = arrayListOf(10,10,10,10)
    val result = hitungTotal(values)
    println(result)
}
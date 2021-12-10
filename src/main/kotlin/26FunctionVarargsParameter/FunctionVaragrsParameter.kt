package `26FunctionVarargsParameter`


// varagrs harus menjadi paramter paling belakang 
fun hitungTotal(vararg values:Int ): Int {
    var total = 0

    for (value in values) {
        total += value
    }
    return total
}

fun main() {
    val result = hitungTotal(10,384,8569,358)
    println(result)
}
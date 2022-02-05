package `31RecursiveFunction`

fun main() {
    fun factorialForLoop(value: Int): Int {
        var result = 1;
        for (i in value downTo 1) {
            result *= i
        }
        return result
    }

    println(factorialForLoop(10))


}
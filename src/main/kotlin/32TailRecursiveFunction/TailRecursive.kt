package `32TailRecursiveFunction`

fun main() {
    tailrec fun factorialRecursive(value: Int, total: Int = 1): Int {
        return when (value) {
            1 -> total
            else -> factorialRecursive(value - 1, total * value)
        }
    }
    println(factorialRecursive(10))

}
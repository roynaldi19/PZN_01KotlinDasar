package `36Closure`

fun main() {
    var counter = 0
    val increment: () -> Unit = {
        counter++
        println("Increment $counter")
    }
    increment()
    increment()
}
package `09TipeDataRange`

fun main() {
    val range = 1..100

    println(range.count())
    println(range.contains(50))
    println(range.contains(101))
    println(range.first)
    println(range.last)
    println(range.step)
}
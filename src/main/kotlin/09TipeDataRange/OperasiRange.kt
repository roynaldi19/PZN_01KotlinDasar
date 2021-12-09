package `09TipeDataRange`

fun main() {
    val range2 = 1..1000
    println(range2.count())
    println(range2.contains(50))
    println(range2.contains(101))
    println(range2.first)
    println(range2.last)
    println(range2.step)

}
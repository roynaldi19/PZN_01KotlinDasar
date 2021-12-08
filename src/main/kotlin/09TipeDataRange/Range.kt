package `09TipeDataRange`

fun main() {
    val range1 = 1..100

    println(range1)
    println(range1.count())
    println(range1.contains(50))
    println(range1.contains(101))
    println(range1.first)
    println(range1.last)
    println(range1.step)
    println()

    val range2 = 100 downTo 1
    println(range2)
    println()

    val range3 = 0..1000 step 10
    println(range3.step)
    println(range3.first)
    println(range3.last)
}
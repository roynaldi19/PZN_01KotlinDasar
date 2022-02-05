package `14WhenExpression`

fun main() {
    val finalExam = 'B'

    when (finalExam) {
        'A', 'B' -> println("Amazing")
        'C' -> println("Good")
        'D' -> println("Not Bad")
        'E' -> println("Bad")
        'F' -> println("Try Again Next Years")
        else -> println("Ups")
    }
}
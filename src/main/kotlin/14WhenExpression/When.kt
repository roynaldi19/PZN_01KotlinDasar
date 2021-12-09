package `14WhenExpression`

fun main() {
    val finalExam = 'Z'

    when (finalExam) {
        'A' -> println("Amazing")
        'B' -> println("Good")
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        'E' -> println("Try Again Next Years")
        else -> println("Ups")
    }
}
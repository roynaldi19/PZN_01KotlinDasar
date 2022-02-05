package `14WhenExpression`

fun main() {
    val finalExam = 40
    when {
        finalExam > 80 -> println("Amazing")
        finalExam > 60 -> println("Good")
        else -> println("Ups")
    }
}
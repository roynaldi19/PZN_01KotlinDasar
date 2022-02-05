package `14WhenExpression`

fun main() {
    val finalExam = 'B'
    val lulus: Array<Char> = arrayOf('A', 'B', 'C')

    when(finalExam) {
        in lulus -> println("Lulus")
        !in lulus -> println("Tidak Lulus")
    }
}
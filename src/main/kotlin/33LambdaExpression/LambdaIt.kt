package `33LambdaExpression`

fun main() {
    val contohLambdaIt: (String) -> String = {
       "Hello $it"
    }

    println(contohLambdaIt("Roy"))
}
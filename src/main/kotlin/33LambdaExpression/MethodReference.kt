package `33LambdaExpression`


//lambda expression dari function yng sudah ada
fun tuUpper(value: String): String = value.toUpperCase()

fun main() {
    val lambdaName: (String) -> String = ::tuUpper

    val name = lambdaName("Roy")
    println(name)
}
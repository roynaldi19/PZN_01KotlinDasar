package `33LambdaExpression`

fun main() {
    val contohLambda: (String, String) -> String = { firstName: String, lastNamde: String ->
        val result = "$firstName $lastNamde"
        result
    }

    val result = contohLambda("Roynaldi", "Kidd")
    println(result)
}
package `33LambdaExpression`

fun main() {
    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
        // baris terakhir menjadi returnValue
    }

    val result = contohLambda("Roynaldi", "Kidd")
    println(result)
}
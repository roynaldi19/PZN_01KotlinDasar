package `28FunctionInfixNotation`

infix fun String.to(type: String): String {
    if (type == "UP") {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

fun main() {
    val result = "Roynadli Kidd" to "UP"
    println(result)
}
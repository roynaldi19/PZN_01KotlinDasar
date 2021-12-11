package `34HigherOrderFunction`

fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }
    println(hello("Roynaldi") { value: String -> value.toUpperCase() })
    println(hello("Roynaldi") { value: String -> value.lowercase() })
}
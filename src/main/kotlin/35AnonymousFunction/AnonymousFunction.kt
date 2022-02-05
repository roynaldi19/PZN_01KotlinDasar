package `35AnonymousFunction`

fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val upper = fun(value: String): String {
        if (value == "") {
            return "Ups"
        } else {
            return value.toUpperCase()
        }
    }

    println(hello("Roynaldi", upper))
    println(hello("", upper))
}
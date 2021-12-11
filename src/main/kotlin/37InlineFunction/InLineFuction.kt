package `37InlineFunction`

inline fun hello(name: () -> String): String {
    return "Hello ${name()}"

}

fun main() {
    println(hello {"Roy"})

}
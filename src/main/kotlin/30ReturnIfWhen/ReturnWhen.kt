package `30ReturnIfWhen`


fun hello(name: String = ""): String {
    return when (name) {
        "" -> "Hello Bro"
        else -> "Hello $name"
    }
}

fun main() {
    println(hello())
}
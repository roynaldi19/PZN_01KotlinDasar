package `30ReturnIfWhen`


fun Hello(name: String = ""): String {
    return when (name) {
        "" -> "Hello Bro"
        else -> "Hello $name"
    }
}

fun main() {
    println(sayHello())
}
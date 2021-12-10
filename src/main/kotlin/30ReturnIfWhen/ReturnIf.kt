package `30ReturnIfWhen`

fun sayHello(name: String  = ""): String {
    return if (name == "") {
        "Hello Bro"
    } else {
        "Hello $name"
    }
}

fun main() {
    println(sayHello("Roy"))
}
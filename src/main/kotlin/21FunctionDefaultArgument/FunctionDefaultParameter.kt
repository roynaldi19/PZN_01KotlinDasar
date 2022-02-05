package `21FunctionDefaultArgument`

fun sayHello(firstname: String, lastName: String = "") {
    println("Hello $firstname $lastName")
}

fun main() {
    sayHello("Roynaldi")
    sayHello("Eko", "Khanedy")
}
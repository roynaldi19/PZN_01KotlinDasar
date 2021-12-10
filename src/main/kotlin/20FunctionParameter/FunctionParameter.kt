package `20FunctionParameter`

fun sayHello(firstname: String, lastName: String?) {
    println("Hello $firstname $lastName")
}

fun main() {
    sayHello("Roynaldi", null)
    sayHello("Jaka", "Satria")
}
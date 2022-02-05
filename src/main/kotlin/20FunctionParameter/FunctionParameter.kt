package `20FunctionParameter`

fun sayHello(firstname: String, lastName: String?) {
    if (lastName == null) {
        println("Hello $firstname")
    } else {
        println("Hello $firstname $lastName")
    }
}

fun main() {
    sayHello("Roynaldi", null)
    sayHello("Eko", "Khanedy")
}
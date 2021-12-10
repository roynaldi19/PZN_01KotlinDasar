package `22FunctionNamedArgument`

fun fullName(firstName: String, midleName: String, lastName: String) {

    println("Hello $firstName $midleName $lastName")

}

fun main() {
    fullName("Eko", "Kurniawan", "Khanedy")
    fullName(lastName = "Khanedy", firstName = "Eko", midleName = "Kurniawan")
}
package `07Variable`

const val APP = "Android Doa"
const val VERSION = "1.2"

fun main() {
    val firstName = "Roy"
    val age = 28

    val name: String? = null
    println(name)

    println(firstName)
    println(age)

    println(name)
    println(name?.length)

    println("Welcome to $APP Version : $VERSION")
}

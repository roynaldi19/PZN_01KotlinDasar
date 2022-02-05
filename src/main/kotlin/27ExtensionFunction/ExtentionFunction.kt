package `27ExtensionFunction`

fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Hello $this")

fun main() {
    val name = "Roy"
    println(name.hello())
    name.printHello()
    "Kidd".printHello()
}
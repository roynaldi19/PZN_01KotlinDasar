package `27ExtensionFunction`

fun String.hello(): String = "Hello $this"

fun main() {
    val name = "Roy"
    println(name.hello())
}
package `06TipeDataString`

fun main() {
    val firstName: String = "Roynaldi"
    val lastName: String = "Kidd"


    val fullName: String = "$firstName $lastName"
    val desc: String = "total $fullName length = ${fullName.length}"

    println(fullName)
    println(desc)
}
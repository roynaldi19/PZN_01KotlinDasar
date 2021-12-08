package `06TipeDataString`

fun main() {
    val firstName: String = "Roynaldi"
    val lastName: String = "Kidd"
    val address: String = """
    |Jl. Kaharudidn nasution
    |gg iklash 2
    |no.91""".trimMargin()

    val fullName: String = "$firstName $lastName"
    val desc: String = "total $fullName length = ${fullName.length}"

    println(firstName)
    println(lastName)
    println(address)
    println(fullName)
    println(desc)


}


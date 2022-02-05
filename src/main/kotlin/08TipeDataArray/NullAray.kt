package `08TipeDataArray`

fun main() {
    val names: Array<String?> = arrayOfNulls(5)

    names[0] = "Eko"
    names[1] = null
    names[2] = "Kurniawan"
    names[3] = null
    names[4] = "Khanedy"

    println(names[0])
    println(names[1])
    println(names[2])
    println(names[3])
    println(names[4])
    println(names.size)

}
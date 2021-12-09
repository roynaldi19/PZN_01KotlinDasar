package `08TipeDataArray`

fun main() {
    val names: Array<String?> = arrayOfNulls(5)
    names.set(0, "Eko")
    names.set(1, null)
    names.set(2, "Kurniawan")
    names.set(3, null)
    names.set(4, "Khanedy")

    println(names[0])
    println(names[1])
    println(names[2])
    println(names[3])
    println(names[4])
    println(names.size)
}
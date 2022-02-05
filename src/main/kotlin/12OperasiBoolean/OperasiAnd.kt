package `12OperasiBoolean`

fun main() {
    val nilaiUjian = 90
    val nilaiAbsen = 60

    val lulusUjian = nilaiUjian > 75
    val lulusAbsen = nilaiAbsen > 75
    val lulusMatakuliah = lulusUjian && lulusAbsen

    println("Kamu lulus ujian : $lulusMatakuliah")
}
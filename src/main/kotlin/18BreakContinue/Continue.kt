package `18BreakContinue`

fun main() {
    for (i in 1..100){

        if (i % 2 == 0) {
            continue
        }
        println("Angka $i")
    }
}
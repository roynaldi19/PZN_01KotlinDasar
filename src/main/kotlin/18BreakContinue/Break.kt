package `18BreakContinue`

fun main() {
    var i = 0

    while (true) {
        println("Hello ke $i")
        i++

        if (i > 100) {
            break
        }
    }
}
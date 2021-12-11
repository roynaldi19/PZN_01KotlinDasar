package `38Label`

fun main() {
    loopI@ for(i in 0..10){
        loopJ@ for (j in 1..10){
            if (i == 5 ) {
                continue@loopI
            }
            println("$i * $j = ${i * j}")

        }
    }
}
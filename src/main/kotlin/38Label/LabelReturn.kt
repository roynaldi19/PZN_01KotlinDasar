package `38Label`

fun main() {

    fun test(name: String, operation:(String) -> Unit)= operation(name)

    test("Roy") test@{
        if (it == ""){
            return@test
        } else {
            println("Roy")
        }
    }

}
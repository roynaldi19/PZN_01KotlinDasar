package `33LambdaExpression`

fun main() {
    //karna hanya ada satu parameter jadi variablenya tidak perlu di deklasraikan di dalam lamda dan guanakna $it untuk menyaksesnya
    val contohLambdaIt: (String) -> String = {
       "Hello $it"
    }

    println(contohLambdaIt("Roy"))
}
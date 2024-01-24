package string

/**
 * ### PostFix Hacker Rank Tech Verito
 * Write a logic to evaluate the Postfix expression
 * 6 3 2 * / 3 2 1 * - +
 */
class PostFix_HackerRank {

    fun solution(exp: String): Int {
        val arr = exp.split(" ").toTypedArray()
        val stack = ArrayDeque<String>()
        for(char in arr){
//            TODO : Need to complete the code
            println(char)
        }
        return 0
    }
}

enum class OperatorEnum(val sign: String) {
    ADD("+"), SUB("-"), MUL("*"),DIV("/")
}

fun main() {
    val obj = PostFix_HackerRank()
    obj.solution("+ 6 3 2 * / 3 2 1 * - +")
}
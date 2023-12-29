package string

/**
 * There is a programming language with only four operations and one variable X:
 *
 * ++X and X++ increments the value of the variable X by 1.
 * --X and X-- decrements the value of the variable X by 1.
 * Initially, the value of X is 0.
 *
 * Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
 *
 *
 *
 * Example 1:
 *
 * Input: operations = ["--X","X++","X++"]
 *
 * Output: 1
 *
 * Explanation: The operations are performed as follows:
 * Initially, X = 0.
 *
 * --X: X is decremented by 1, X =  0 - 1 = -1.
 *
 * X++: X is incremented by 1, X = -1 + 1 =  0.
 *
 * X++: X is incremented by 1, X =  0 + 1 =  1.
 */
class PerformingOps_2011 {

    //My solution
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var value = 0
        for (i in operations) {
            if (i.contains("+")) {
                value++
            } else
                value--
        }
        return value
    }

    //optimum solution
    fun finalValueAfterOperations2(operations: Array<String>): Int =
        operations.fold(0) { acc, s ->
            when (s) {
                "X--" -> acc - 1
                "--X" -> acc - 1
                "X++" -> acc + 1
                "++X" -> acc + 1
                else -> throw IllegalArgumentException()
            }
        }
}

fun main() {
    val arr = arrayOf("X++", "++X", "--X", "X--")

    val obj = PerformingOps_2011()

    var value = obj.finalValueAfterOperations(arr)
    println(value)

    value = obj.finalValueAfterOperations2(arr)
    println(value)
}
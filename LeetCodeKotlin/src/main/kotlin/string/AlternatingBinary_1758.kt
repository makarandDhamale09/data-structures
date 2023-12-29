package string

import kotlin.math.min

/**
 * You are given a string s consisting only of the characters '0' and '1'. In one operation, you can change any '0' to '1' or vice versa.
 *
 * The string is called alternating if no two adjacent characters are equal. For example, the string "010" is alternating, while the string "0100" is not.
 *
 * Return the minimum number of operations needed to make s alternating.
 *
 * Example 1:
 *
 * Input: s = "0100"
 *
 *
 * Output: 1
 *
 *
 * Explanation: If you change the last character to '1', s will be "0101", which is alternating.
 *
 */
fun main() {
    val obj = AlternatingBinary_1758()
    val minOperations = obj.minOperations("10010100")
    println("Minimum Operations : $minOperations")
}

/**
 * To solve this problem we are using a simple approach.There can be only 2 solutions to any string
 *
 * 10101
 *
 * 01010
 *
 * So we consider '01010' as the approach to solve it. So if solution for this approach is
 * x then with the other approach it is n-x where n is length of string
 *
 * Then we return the min of count or length-count
 */
class AlternatingBinary_1758 {
    fun minOperations(s: String): Int {
        var count = 0
        for (i in s.indices) {
            if (i % 2 == 0) {
                if (s[i] == '1') {
                    count++
                }
            } else {
                if (s[i] == '0') {
                    count++
                }
            }
        }
        return min(count, s.length - count)
    }
}


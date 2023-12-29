package string

class AlternatingBinary_1758 {
    fun minOperations(s: String): Int {
        var prev = s[0]
        val n = s.length
        var count = 0
        for (i in 1..n - 1) {
            prev = if (s[i] == prev) {
                count++
                when (s[i]) {
                    '0' -> '1'
                    else -> '0'
                }
            } else
                s[i]
        }
        return count
    }
}

fun main() {
    val obj = AlternatingBinary_1758()

    val minOperations = obj.minOperations("10010100")
    //10010100
    //01010101
    println("Minimum Operations : $minOperations")
}
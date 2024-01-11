package binary

class AddBinary_67 {
    fun solution(a: String, b: String): String {
        var l = a.length - 1
        var r = b.length - 1
        var carry = 0
        var result = ""

        while (l >= 0 || r >= 0) {
            var b1 = 0
            var b2 = 0

            if (l >= 0) {
                b1 = a[l].digitToInt()
            }

            if (r >= 0) {
                b2 = b[r].digitToInt()
            }

            val total = b1 + b2 + carry

            val i = total % 2
            carry = total / 2

            result = i.toString() + result
            l--
            r--
        }
        if (carry != 0) {
            result = carry.toString() + result
        }
        return result
    }
}

fun main() {
    val obj = AddBinary_67()
    val result = obj.solution("1010", "1011")
    println("Result : $result")
}
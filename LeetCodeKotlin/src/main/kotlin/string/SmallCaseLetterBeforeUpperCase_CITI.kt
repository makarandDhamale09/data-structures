package string

/**
 * ## Count Number of Lowercase Characters before their corresponding Uppercase
 * There is a string with uppercase and lowercase characters need to find all the lowercase
 * character that comes before its corresponding uppercase character.
 *
 * **Input** : "abcABCFc"
 *
 * **Output** : 2
 *
 * **Explanation** : only character a and b come before A and B. c is also before C but its
 * another instance also comes after the uppercase C.
 *
 */
class SmallCaseLetterBeforeUpperCase_CITI {
    fun solution(str: String): Int {
        val map = HashMap<Char, Int>()
        var count = 0
        for ((i, c) in str.withIndex()) {
            println("Index $i and character $c")
            map[c] = i
        }

        map.filter { e -> e.key.isLowerCase() }
            .forEach { (t, u) ->
                val idx = map[t.uppercaseChar()]
                if (idx != null && idx > u) {
                    count++
                }
            }
        return count
    }
    //TODO : To add a more efficient solution.
}

fun main() {
    val obj = SmallCaseLetterBeforeUpperCase_CITI()
    val solution = obj.solution("abcABCFc")
    println("Result : $solution")
}
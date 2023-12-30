package string

import java.util.*

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 *
 * Output: true
 *
 */
class Anagram_242 {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val toCharArrayS = s.toCharArray()
        val toCharArrayT = t.toCharArray()

        Arrays.sort(toCharArrayS)
        Arrays.sort(toCharArrayT)

        return String(toCharArrayS) == String(toCharArrayT)
    }
}

fun main() {
    val obj = Anagram_242()
    val result = obj.isAnagram("car", "rat")
    println(result)
}
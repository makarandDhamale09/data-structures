package string

/**
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 *
 * A defanged IP address replaces every period "." with "[.]".
 * Example 1:
 *
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 * Example 2:
 *
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 *
 */
class DefangIPAddress {
    fun defangIPaddr(address: String): String {
        var res = ""
        for (i in address) {
            if (i == '.')
                res += "[.]"
            else
                res += i
        }
        return res
    }
}

fun main(args: Array<String>) {
    val defang = DefangIPAddress()
    val defangIPaddr = defang.defangIPaddr("255.100.50.0")

    println(defangIPaddr)

}
package array

import java.util.*

class MergeSortedArrays_88 {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var l = 0
        var r = 0
        val arr = IntArray(m + n)
        var curr = 0
        while (l < m && r < n) {

        }
        println(arr.contentToString())
    }
}

fun main() {
    var array1 = intArrayOf(1, 2, 3, 0, 0, 0)
    var array2 = intArrayOf(2, 5, 6)

    var obj = MergeSortedArrays_88()
    obj.merge(array1, 3, array2, 3)
}
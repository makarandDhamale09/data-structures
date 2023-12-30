package linkedList

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 *
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 *
 * Output: [7,0,8]
 *
 * Explanation: 342 + 465 = 807.
 *
 */
class AddTwoNumbers_2 {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var list1 = l1
        var list2 = l2
        val dummyNode = ListNode(Int.MIN_VALUE)
        var currNode = dummyNode
        var remainder = 0

        while (list1 != null || list2 != null || remainder != 0) {
            var sum = 0
            if (list1 != null) {
                sum += list1.value
                list1 = list1.next
            }
            if (list2 != null) {
                sum += list2.value
                list2 = list2.next
            }
            sum += remainder
            remainder = sum / 10
            sum %= 10

            currNode.next = ListNode(sum)
            currNode = currNode.next!!
        }
        return dummyNode.next
    }
}

fun main() {

    val f7 = ListNode(9)
    val f6 = ListNode(9, f7)
    val f5 = ListNode(9, f6)
    val f4 = ListNode(9, f5)
    val f3 = ListNode(9, f4)
    val f2 = ListNode(9, f3)
    val f1 = ListNode(9, f2)

    ListNode.printList(f1)

    val s4 = ListNode(9)
    val s3 = ListNode(9, s4)
    val s2 = ListNode(9, s3)
    val s1 = ListNode(9, s2)

    ListNode.printList(s1)

    val addTwoNum = AddTwoNumbers_2()
    val resultList = addTwoNum.addTwoNumbers(f1, s1)
    ListNode.printList(resultList)
}

class ListNode(var value: Int) {
    var next: ListNode? = null

    constructor(value: Int, next: ListNode? = null) : this(value) {
        this.next = next
    }

    //To print the linked list
    companion object {
        fun printList(list: ListNode?) {
            var currNode = list
            while (currNode != null) {
                print("${currNode.value}-->")
                currNode = currNode.next
            }
            println()
        }
    }
}


package linkedList

class RemoveDuplicates_83 {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var currentNode = head;
        var nextValue = currentNode?.next?.value
        while (currentNode != null) {
            if (currentNode.value == nextValue) {
                currentNode.next = currentNode.next?.next
            }else
                currentNode = currentNode.next
            nextValue = currentNode?.next?.value
        }
        return head
    }
}

fun main() {
    var obj = RemoveDuplicates_83()

    val n3 = ListNode(1)
    val n2 = ListNode(1, n3)
    val n1 = ListNode(1, n2)

    ListNode.printList(n1)
    val deleteDuplicates = obj.deleteDuplicates(n1)
    ListNode.printList(deleteDuplicates)
}
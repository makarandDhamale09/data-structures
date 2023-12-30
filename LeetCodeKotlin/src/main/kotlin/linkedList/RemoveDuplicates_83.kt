package linkedList

class RemoveDuplicates_83 {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var currentNode = head?.next;
        var currentVal = head?.value;
        while (currentNode != null) {
            if (currentNode.value == currentVal) {
                var previousNode = currentNode;
                var nextNode = currentNode.next;
            }
            currentVal = currentNode.value;
            currentNode = currentNode.next;
        }
        return head;
    }
}

fun main() {
    var obj = RemoveDuplicates_83()

    val n5 = ListNode(3)
    val n4 = ListNode(2, n5)
    val n3 = ListNode(2, n4)
    val n2 = ListNode(4, n3)
    val n1 = ListNode(1, n2)

    ListNode.printList(n1)
    val deleteDuplicates = obj.deleteDuplicates(n1)
    ListNode.printList(deleteDuplicates)
}
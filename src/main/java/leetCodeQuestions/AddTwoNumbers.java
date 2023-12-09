package leetCodeQuestions;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * Example 2:
 * <p>
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * Example 3:
 * <p>
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l3 = new ListNode(3);
        ListNode l2 = new ListNode(4, l3);
        ListNode l1 = new ListNode(2, l2);

        ListNode m3 = new ListNode(4);
        ListNode m2 = new ListNode(6, m3);
        ListNode m1 = new ListNode(5, m2);


        ListNode listNode = addTwoNumbers.addTwoNumbers(l1, m1);
        System.out.println(listNode);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //2->4->3
        //5->6->4
//result //7->0->8
        int remainder = 0;
        ListNode dummy = new ListNode();
        ListNode currentNode = dummy;
        while(l1 !=null || l2!=null || remainder!=0){
            int v1 = 0;
            int v2 = 0;
            if(l1!=null){
                v1 = l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                v2 = l2.val;
                l2 = l2.next;
            }
            int sum = v1 + v2 + remainder;
            remainder = sum /10;
            currentNode.next = new ListNode(sum%10);
        }
        return dummy.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

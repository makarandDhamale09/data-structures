package main.java.LinkedList;


import main.java.LinkedList.SingleLinkedList.Node;
import main.java.LinkedList.SingleLinkedList.SingleLinkedList;

/**
 * You have two numbers represented by a linked list, where each node contains a single digit. The
 * digits are stored in reverse order, such that the 1's digit is at the head of the list. Write a
 * function that adds the two numbers and returns the sum as a linked list.
 *
 * <p>list1 = 7 -> 1 -> 6 list2 = 5 -> 9 -> 2 result = 2 -> 1 -> 9
 */
public class SumLists {
    public static void main(String[] args) {
        SingleLinkedList sLL1 = new SingleLinkedList(7);
        sLL1.addLast(1);
        sLL1.addLast(6);

        SingleLinkedList sLL2 = new SingleLinkedList(5);
        sLL2.addLast(9);
        sLL2.addLast(2);

        sLL1.traverseSinglyLinkedList();
        sLL2.traverseSinglyLinkedList();

        // SingleLinkedList result = sumLists(sLL1, sLL2);

        // result.traverseSinglyLinkedList();

        SingleLinkedList result2 = sumLists2(sLL1, sLL2);

        result2.traverseSinglyLinkedList();
    }

    public static SingleLinkedList sumLists(SingleLinkedList l1, SingleLinkedList l2) {
        int carryFwd = 0;
        int size = Math.max(l1.size, l2.size);
        Node n1 = l1.head;
        Node n2 = l2.head;
        for (int i = 0; i < size; i++) {
            int sum = n1.value + n2.value + carryFwd;
            carryFwd = sum / 10;
            n1.value = sum % 10;
            n1 = n1.nextNode;
            n2 = n2.nextNode;
        }
        return l1;
    }

    /**
     * @author : Makarand Dhamale Udemy method
     */
    public static SingleLinkedList sumLists2(SingleLinkedList l1, SingleLinkedList l2) {
        Node n1 = l1.head;
        Node n2 = l2.head;
        int carryFwd = 0;
        SingleLinkedList result = new SingleLinkedList();
        while (n1 != null && n2 != null) {
            int sum = carryFwd;
            if (n1 != null) {
                sum += n1.value;
                n1 = n1.nextNode;
            }
            if (n2 != null) {
                sum += n2.value;
                n2 = n2.nextNode;
            }
            result.insertNode(sum % 10);
            carryFwd = sum / 10;
        }
        return result;
    }
}

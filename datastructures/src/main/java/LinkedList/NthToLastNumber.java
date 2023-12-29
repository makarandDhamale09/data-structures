package LinkedList;

import LinkedList.SingleLinkedList.Node;
import LinkedList.SingleLinkedList.SingleLinkedList;
import java.util.Arrays;
import java.util.LinkedList;

public class NthToLastNumber {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println(NthToLast(linkedList, 2));

        SingleLinkedList sLL = new SingleLinkedList(1);
        sLL.addLast(2);
        sLL.addLast(3);
        sLL.addLast(4);
        sLL.addLast(5);

        sLL.traverseSinglyLinkedList();

        System.out.println(NthToLast(sLL, 2).value);
    }

    public static Integer NthToLast(LinkedList linkedList, int n) {
        int size = linkedList.size();
        return (Integer) linkedList.get(size - n);
    }

    public static Node NthToLast(SingleLinkedList sLL, int n) {
        Node n1 = sLL.head;
        Node n2 = sLL.head;
        for (int i = 0; i < n; i++) {
            if (n2 == null) return null;
            n2 = n2.nextNode;
        }
        while (n2 != null) {
            n1 = n1.nextNode;
            n2 = n2.nextNode;
        }
        return n1;
    }
}

package main.java.LinkedList;

import main.java.LinkedList.SingleLinkedList.Node;
import main.java.LinkedList.SingleLinkedList.SingleLinkedList;

public class Partition {
    public static void main(String[] args) {
        SingleLinkedList sLL = new SingleLinkedList(7);
        sLL.addLast(10);
        sLL.addLast(11);
        sLL.addLast(9);
        sLL.addLast(2);
        sLL.addLast(3);
        sLL.addLast(1);
        sLL.addLast(5);

        sLL.traverseSinglyLinkedList();

        SingleLinkedList sLL2 = partition(sLL, 5);

        sLL2.traverseSinglyLinkedList();
    }

    public static SingleLinkedList partition(SingleLinkedList sLL, int x) {
        Node tempNode = sLL.head.nextNode;
        SingleLinkedList sLL2 = new SingleLinkedList(sLL.head.value);
        for (int i = 1; i < sLL.size; i++) {
            if (tempNode.value >= x) {
                sLL2.addLast(tempNode.value);
            } else {
                sLL2.addFirst(tempNode.value);
            }
            tempNode = tempNode.nextNode;
        }
        return sLL2;
    }
}

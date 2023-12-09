package main.java.LinkedList;


import main.java.LinkedList.SingleLinkedList.Node;
import main.java.LinkedList.SingleLinkedList.SingleLinkedList;

public class IntersectingList {

    public static void main(String[] args) {
        SingleLinkedList llA = new SingleLinkedList();
        llA.insertNode(3);
        llA.insertNode(1);
        llA.insertNode(5);
        llA.insertNode(9);
        llA.insertNode(10);
        SingleLinkedList llB = new SingleLinkedList();
        llB.insertNode(2);
        llB.insertNode(4);
        llB.insertNode(6);
        IntersectingList ex = new IntersectingList();
        ex.addSameNode(llA, llB, 7);
        ex.addSameNode(llA, llB, 2);
        ex.addSameNode(llA, llB, 1);
        Node inter = ex.findIntersection(llA, llB);
        System.out.println(inter.value);
    }

    private Node findIntersection(SingleLinkedList llA, SingleLinkedList llB) {
        Node a = llA.head;
        Node b = llB.head;
        if (llA.size > llB.size) {
            a = getKthNode(llA, Math.abs(llA.size - llB.size));
        } else {
            b = getKthNode(llB, Math.abs(llA.size - llB.size));
        }
        while (a != b) {
            a = a.nextNode;
            b = b.nextNode;
        }
        return a;
    }

    void addSameNode(SingleLinkedList llA, SingleLinkedList llB, int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        llA.tail.nextNode = newNode;
        llA.tail = newNode;
        llB.tail.nextNode = newNode;
        llB.tail = newNode;
    }

    Node getKthNode(SingleLinkedList ll, int k) {
        Node n = ll.head;
        if (n == null) {
            return null;
        }
        while (k > 0) {
            n = n.nextNode;
            k--;
        }
        return n;
    }
}

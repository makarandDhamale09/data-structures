package LinkedList.SingleLinkedList;

public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public SingleLinkedList() {}

    public SingleLinkedList(int value) {
        createList(value);
    }

    public Node createList(int value) {
        Node node = new Node();
        node.nextNode = null;
        node.value = value;
        size = 1;
        head = node;
        tail = node;
        return head;
    }

    public Node insertNode(int value) {
        if (this.head == null) {
            return createList(value);
        }
        Node node = new Node();
        node.value = value;
        node.nextNode = null;
        tail.nextNode = node;
        tail = node;
        size++;
        return node;
    }

    public boolean insertValueAt(int value, int index) {
        if (index == 0) {
            return addFirst(value);
        } else if (index == size - 1) {
            return addLast(value);
        } else {
            Node nodeBefore = getNode(index);
            Node node = nodeBefore.nextNode;
            node.value = value;
            return true;
        }
    }

    public boolean addFirst(int value) {
        Node node = new Node();
        node.value = value;
        node.nextNode = head;
        head = node;
        size += 1;
        return true;
    }

    public boolean addLast(int value) {
        Node node = new Node();
        node.value = value;
        node.nextNode = null;
        tail.nextNode = node;
        tail = node;
        size += 1;
        return true;
    }

    public boolean addBefore(int value, int index) {
        Node nodeBefore = getNode(index);
        Node node = new Node();
        node.nextNode = nodeBefore.nextNode;
        nodeBefore.nextNode = node;
        node.value = value;
        size++;
        return true;
    }

    private Node getNode(int index) {
        Node tempNode = head;
        int loc = 0;
        while (loc < index - 1) {
            tempNode = tempNode.nextNode;
            loc++;
        }
        return tempNode;
    }

    public void traverseSinglyLinkedList() {
        if (head == null) {
            System.out.println("Singly Linked List does not exist");
        } else {
            Node n = head;
            for (int i = 0; i < size; i++) {
                System.out.print(n.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                n = n.nextNode;
            }
            System.out.println("\n");
        }
    }

    public boolean searchNode(int value) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == value) {
                    System.out.println("Node found at location " + i + "\n");
                    return true;
                }
                tempNode = tempNode.nextNode;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    public void deleteNode(int loc) {
        if (head == null) {
            System.out.println("SinglyLinkedList does not exist");
        } else if (loc == 0) {
            head = head.nextNode;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else if (loc >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.nextNode;
            }
            if (tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode = tempNode.nextNode;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < loc - 1; i++) {
                tempNode = tempNode.nextNode;
            }
            tempNode.nextNode = tempNode.nextNode.nextNode;
            size--;
        }
    }

    public void deleteSLL() {
        head = null;
        tail = null;
        System.out.println("SinglyLinkedList deleted successfully");
    }
}

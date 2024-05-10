package LinkedList.SingleLinkedList;

public class Main {

  public static void main(String[] args) {
    SingleLinkedList sl = new SingleLinkedList();
    sl.createList(5);
    sl.addFirst(4);
    sl.addLast(7);
    sl.addLast(8);
    sl.insertValueAt(6, 2);

    sl.traverseSinglyLinkedList();

    sl.addBefore(7, 3);
    sl.traverseSinglyLinkedList();
    sl.searchNode(6);

    sl.deleteNode(9);
    sl.traverseSinglyLinkedList();

    sl.deleteSLL();
    sl.traverseSinglyLinkedList();
  }
}

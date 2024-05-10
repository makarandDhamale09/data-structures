package Queue.LinearQ_Array;

public class Main {
  public static void main(String[] args) {
    QueueArray queueArray = new QueueArray(3);
    queueArray.enQueue(2);
    queueArray.enQueue(3);
    queueArray.enQueue(1);
    queueArray.enQueue(4);

    // to remove the elements from queue
    /*queueArray.deQueue();
    queueArray.deQueue();
    queueArray.deQueue();*/

    System.out.println(queueArray.peek());

    queueArray.deleteQueue();
  }
}

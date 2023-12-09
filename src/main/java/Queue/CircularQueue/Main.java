package Queue.CircularQueue;

public class Main {
    public static void main(String[] args) {
        CircularQ circularQ = new CircularQ(3);

        System.out.println(circularQ.isEmpty());

        System.out.println(circularQ.isFull());

        circularQ.enQueue(1);
        circularQ.enQueue(2);
        circularQ.enQueue(3);
        circularQ.enQueue(4);

        System.out.println(circularQ.deQueue());

        System.out.println(circularQ.deQueue());

        circularQ.enQueue(4);

        System.out.println(circularQ.beginningOfQueue);
        System.out.println(circularQ.topOfQueue);

        System.out.println(circularQ.peek());

        circularQ.deleteQueue();
    }
}

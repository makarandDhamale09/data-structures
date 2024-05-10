package Queue.LinearQ_Array;

public class QueueArray {
  int[] arr;
  int topOfQueue;
  int beginningOfQueue;

  public QueueArray(int size) {
    this.arr = new int[size];
    topOfQueue = -1;
    beginningOfQueue = -1;

    System.out.println("Queue is successfully created with size of " + size);
  }

  public boolean isFull() {
    return topOfQueue == arr.length - 1;
  }

  public boolean isEmpty() {
    return beginningOfQueue == -1 || beginningOfQueue == arr.length;
  }

  public void enQueue(int value) {
    if (isFull()) {
      System.out.println("The queue is full");
      return;
    }
    if (isEmpty()) {
      beginningOfQueue = 0;
    }
    topOfQueue++;
    arr[topOfQueue] = value;
    System.out.println("Value successfully added in queue");
  }

  public int deQueue() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return -1;
    }
    int value = arr[beginningOfQueue];
    beginningOfQueue++;
    if (beginningOfQueue > topOfQueue) {
      beginningOfQueue = topOfQueue = -1;
    }
    System.out.println("Successfully removed value :" + value);
    return value;
  }

  public int peek() {
    if (!isEmpty()) {
      return arr[beginningOfQueue];
    }
    System.out.println("Queue is empty");
    return -1;
  }

  public void deleteQueue() {
    arr = null;
    System.out.println("Queue is successfully deleted");
  }
}

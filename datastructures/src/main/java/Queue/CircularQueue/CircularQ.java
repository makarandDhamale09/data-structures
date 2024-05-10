package Queue.CircularQueue;

public class CircularQ {
  int[] arr;
  int topOfQueue;
  int beginningOfQueue;
  int size;

  public CircularQ(int size) {
    this.arr = new int[size];
    this.size = size;
    this.topOfQueue = -1;
    this.beginningOfQueue = -1;
    System.out.println("CircularQ is successfully created with size " + size);
  }

  public boolean isEmpty() {
    return topOfQueue == -1;
  }

  public boolean isFull() {
    return (beginningOfQueue == 0 && topOfQueue == size - 1) || topOfQueue == beginningOfQueue - 1;
  }

  public void enQueue(int value) {
    if (isFull()) {
      System.out.println("The CircularQueue is full");
      return;
    } else if (isEmpty()) {
      beginningOfQueue = 0;
    } else {
      if (topOfQueue + 1 == size) {
        topOfQueue = -1;
      }
    }
    topOfQueue++;
    arr[topOfQueue] = value;
    System.out.println("Value " + value + " inserted successfully");
  }

  public int deQueue() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return -1;
    }
    int result = arr[beginningOfQueue];
    arr[beginningOfQueue] = 0;
    if (beginningOfQueue == topOfQueue) {
      beginningOfQueue = topOfQueue = -1;
    } else if (beginningOfQueue + 1 == size) {
      beginningOfQueue = 0;
    } else {
      beginningOfQueue++;
    }
    return result;
  }

  public int peek() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return -1;
    }
    return arr[beginningOfQueue];
  }

  public void deleteQueue() {
    this.arr = null;
    System.out.println("Queue successfully deleted");
  }
}

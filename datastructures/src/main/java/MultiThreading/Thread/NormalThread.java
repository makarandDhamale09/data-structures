package MultiThreading.Thread;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class NormalThread {
  public static void main(String[] args) throws InterruptedException {
    Task task = new Task();

    Thread t1 = new Thread(() -> task.task(4));
    Thread t2 = new Thread(() -> task.task(2));
    Thread t3 = new Thread(() -> task.task(1));

    LocalTime start = LocalTime.now();
    t1.start();
    t2.start();
    t3.start();

    t1.join();
    t2.join();
    t2.join();
    LocalTime endTime = LocalTime.now();
    System.out.println("Difference :" + ChronoUnit.SECONDS.between(start, endTime));
  }
}

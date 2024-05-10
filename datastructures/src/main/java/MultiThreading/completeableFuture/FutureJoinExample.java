package MultiThreading.completeableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class FutureJoinExample {
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    System.out.println("Started");
    // Creating CompletableFuture instances
    CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> task1());
    CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> task2());
    CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> task3());

    System.out.println("Submitted");

    // Combining the results of all CompletableFuture instances
    CompletableFuture<Void> allFutures = CompletableFuture.allOf(future1, future2, future3);

    System.out.println("Joined and waiting");

    // Joining the results
    allFutures.get(); // Wait for all futures to complete

    System.out.println("Completed");

    // Getting individual results
    int result1 = future1.get();
    int result2 = future2.get();
    int result3 = future3.get();

    // Perform further operations with the results
    System.out.println("Result of future1: " + result1);
    System.out.println("Result of future2: " + result2);
    System.out.println("Result of future3: " + result3);

    // Perform other operations...
  }

  // Simulated asynchronous tasks
  static int task1() {
    // Simulating some computation
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    return 10;
  }

  static int task2() {
    // Simulating some computation
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    return 20;
  }

  static int task3() {
    // Simulating some computation
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    return 30;
  }
}

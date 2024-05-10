package MultiThreading.executorframework;

import java.util.Random;
import java.util.concurrent.*;

class Executor_Callable {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    // create a thread pool
    ExecutorService service = Executors.newFixedThreadPool(10);

    System.out.println("Started");
    // submit task to thread pool
    Future<Integer> response = service.submit(new Task());

    System.out.println("Thread performing some operations : " + Thread.currentThread().getName());

    Integer i = response.get(); // blocking operation as the thread is waiting here for 5 sec to get
    // the response.
    System.out.println("Response : " + i);

    service.shutdown();
  }

  static class Task implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
      Thread.sleep(5000);
      return new Random().nextInt();
    }
  }
}

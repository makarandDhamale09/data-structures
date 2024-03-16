package MultiThreading.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor_Runnable {
    public static void main(String[] args) {
        //create a thread pool
        ExecutorService service = Executors.newFixedThreadPool(10);

        //submit task to thread pool
        for (int i = 0; i < 100; i++) {
            service.execute(new Task());
        }
        System.out.println("Thread Name completed: " + Thread.currentThread().getName());
        System.out.println("State : " + Thread.currentThread().getState());

        service.shutdown();
    }

    static class Task implements Runnable {

        @Override
        public void run() {
            System.out.println("Thread Name : " + Thread.currentThread().getName());
        }
    }
}

package MultiThreading.Thread;

public class Task{

    public void task(long sec) {
        try {
            System.out.printf("Sleeping for %d\n", sec);
            Thread.sleep(sec * 1000);
        }catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }
}

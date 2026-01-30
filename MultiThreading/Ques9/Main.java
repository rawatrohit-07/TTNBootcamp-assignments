package Ques9;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executor.submit(() -> {
                try {
                    System.out.println("Task " + taskId + " started by " + Thread.currentThread().getName());
                    Thread.sleep(3000);
                    System.out.println("Task " + taskId + " completed");
                } catch (InterruptedException e) {
                    System.out.println("Task " + taskId + " interrupted");
                }
            });
        }
        Thread.sleep(2000);
        System.out.println("\nCalling shutdown()...");
        executor.shutdown();
        if (!executor.awaitTermination(2, TimeUnit.SECONDS)) {
            System.out.println("Not all tasks finished yet...");
        }
        ExecutorService executor2 = Executors.newFixedThreadPool(2);
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executor2.submit(() -> {
                try {
                    System.out.println("Task " + taskId + " started by " + Thread.currentThread().getName());
                    Thread.sleep(3000);
                    System.out.println("Task " + taskId + " completed");
                } catch (InterruptedException e) {
                    System.out.println("Task " + taskId + " interrupted");
                }
            });
        }
        Thread.sleep(2000);
        System.out.println("\nCalling shutdownNow()...");
        List<Runnable> pendingTasks = executor2.shutdownNow();
        System.out.println("Pending tasks not executed: " + pendingTasks.size());
    }
}



package Ques7;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


class WorkerTask implements Runnable {

    private final String workerName;

    WorkerTask(String workerName) {
        this.workerName = workerName;
    }

    @Override
    public void run() {
        System.out.println(workerName + " is working on "
                + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(workerName + " finished work");
    }
}


public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<Runnable> tasks = Arrays.asList(
                new WorkerTask("Rohit"),
                new WorkerTask("Krish"),
                new WorkerTask("kamal"),
                new WorkerTask("Mohan")
        );

        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        submitTasksAndWait(singleThreadExecutor, tasks, "SingleThreadExecutor");

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        submitTasksAndWait(cachedThreadPool, tasks, "CachedThreadPool");

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(2);
        submitTasksAndWait(fixedThreadPool, tasks, "FixedThreadPool");
    }

    private static void submitTasksAndWait(
            ExecutorService executor,
            List<Runnable> tasks,
            String executorName) throws InterruptedException {

        System.out.println("\nUsing " + executorName);

        for (Runnable task : tasks) {
            executor.submit(task);
        }

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println("All tasks completed using " + executorName);
        System.out.println("----------------------------------");
    }
}


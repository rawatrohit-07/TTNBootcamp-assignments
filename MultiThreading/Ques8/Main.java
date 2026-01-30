package Ques8;
import java.util.concurrent.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        try {
            Future<Integer> future = executor.submit(() -> {
                Thread.sleep(1000);
                Random random = new Random();
                int randomNum = random.nextInt(1000);
                System.out.println("Generated: " + randomNum);
                return randomNum;
            });
            System.out.println("Is task done? " + future.isDone());
            Integer result = future.get();
            System.out.println("Final result: " + result);
            System.out.println("Is task done now? " + future.isDone());

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}

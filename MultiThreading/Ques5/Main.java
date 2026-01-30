package Ques5;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class RunnableTask implements Runnable {

    @Override
    public void run() {
        System.out.println("RunnableTask is working...");
    }
}

class CallableTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("CallableTask is calculating...");
        Thread.sleep(1000);
        return 10 + 20;
    }
}

public class Main {

    public static void main(String[] args)
            throws InterruptedException, ExecutionException {
            Thread runnableThread = new Thread(new RunnableTask());
            runnableThread.start();
            FutureTask<Integer> futureTask = new FutureTask<>(new CallableTask());
            Thread callableThread = new Thread(futureTask);
            callableThread.start();
            System.out.println("Result from Callable: " + futureTask.get());
    }
}


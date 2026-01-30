package Ques3;

class Signal {

    private volatile boolean running = true;

    public boolean isRunning() {
        return running;
    }

    public void stop() {
        running = false;
    }
}

class WorkerThread extends Thread {

    private final Signal signal;

    WorkerThread(Signal signal) {
        this.signal = signal;
    }

    @Override
    public void run() {
        System.out.println("Worker thread started.");

        while (signal.isRunning()) {
        }

        System.out.println("Worker thread stopped.");
    }
}

public class Volatile {

    public static void main(String[] args) throws InterruptedException {

        Signal signal = new Signal();
        WorkerThread worker = new WorkerThread(signal);

        worker.start();

        Thread.sleep(3000);

        System.out.println("Main thread stopping worker");
        signal.stop();
    }
}

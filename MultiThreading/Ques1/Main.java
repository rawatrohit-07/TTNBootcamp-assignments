package Ques1;

public class Main{

    public static void main(String[] args) {

        Thread t1 = new Thread(new MyRunnable(), "Runnable-Thread");

        MyThread t2 = new MyThread();
        t2.setName("Thread-Class");

        t1.start();
        t2.start();

        try {
            t1.join();

            System.out.println("Main thread resumed after Runnable-Thread");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread ends");
    }
}


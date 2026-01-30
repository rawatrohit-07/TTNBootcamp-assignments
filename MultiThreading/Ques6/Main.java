package Ques6;
import java.util.concurrent.locks.ReentrantLock;

class WriterOne extends Thread {

    private final ReentrantLock bookLock;
    private final ReentrantLock penLock;

    WriterOne(ReentrantLock bookLock, ReentrantLock penLock) {
        super("WriterOne");
        this.bookLock = bookLock;
        this.penLock = penLock;
    }

    @Override
    public void run() {
        try {
            if (bookLock.tryLock()) {
                System.out.println(getName() + " locked Book");
                Thread.sleep(1000);

                if (penLock.tryLock()) {
                    try {
                        System.out.println(getName() + " locked Pen");
                        System.out.println(getName() + " is writing...");
                    } finally {
                        penLock.unlock();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        } finally {
            if (bookLock.isHeldByCurrentThread()) {
                bookLock.unlock();
            }
        }
    }
}

class WriterTwo extends Thread {

    private final ReentrantLock bookLock;
    private final ReentrantLock penLock;

    WriterTwo(ReentrantLock bookLock, ReentrantLock penLock) {
        super("WriterTwo");
        this.bookLock = bookLock;
        this.penLock = penLock;
    }

    @Override
    public void run() {
        try {
            if (penLock.tryLock()) {
                System.out.println(getName() + " locked Pen");
                Thread.sleep(1000);

                if (bookLock.tryLock()) {
                    try {
                        System.out.println(getName() + " locked Book");
                        System.out.println(getName() + " is writing...");
                    } finally {
                        bookLock.unlock();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        } finally {
            if (penLock.isHeldByCurrentThread()) {
                penLock.unlock();
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {

        ReentrantLock bookLock = new ReentrantLock();
        ReentrantLock penLock = new ReentrantLock();

        WriterOne writerOne = new WriterOne(bookLock, penLock);
        WriterTwo writerTwo = new WriterTwo(bookLock, penLock);

        writerOne.start();
        writerTwo.start();
    }
}


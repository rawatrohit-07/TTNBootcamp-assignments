package Ques4;

class Account {

    public synchronized void withdraw(Account acc) {
        System.out.println(Thread.currentThread().getName() + " locked its own account");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " waiting for other account");
        acc.deposit();
    }

    public synchronized void deposit() {
        System.out.println(Thread.currentThread().getName() + " locked deposit");
    }
}

public class Main {

    public static void main(String[] args) {

        Account acc1 = new Account();
        Account acc2 = new Account();

        Thread t1 = new Thread(() -> acc1.withdraw(acc2), "Thread-1");
        Thread t2 = new Thread(() -> acc2.withdraw(acc1), "Thread-2");

        t1.start();
        t2.start();
    }
}

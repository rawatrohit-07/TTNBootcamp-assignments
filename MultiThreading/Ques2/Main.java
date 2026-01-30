package Ques2;
class Printer {
    public synchronized void printUsingMethod(String name) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " printing (method) page " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public void printUsingBlock(String name) {
        synchronized (this) {
            for (int i = 1; i <= 3; i++) {
                System.out.println(name + " printing (block) page " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class Employee extends Thread {

    Printer printer;
    boolean useMethod;

    Employee(Printer printer, boolean useMethod, String name) {
        super(name);
        this.printer = printer;
        this.useMethod = useMethod;
    }

    @Override
    public void run() {
        if (useMethod) {
            printer.printUsingMethod(getName());
        } else {
            printer.printUsingBlock(getName());
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer();

        Employee e1 = new Employee(printer, true, "Rohit");
        Employee e2 = new Employee(printer, true, "Mohit");

        Employee e3 = new Employee(printer, false, "Rahul");
        Employee e4 = new Employee(printer, false, "Ishmeet");

        e1.start();
        e2.start();
        e3.start();
        e4.start();
    }
}

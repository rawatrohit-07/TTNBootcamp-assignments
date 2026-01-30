package Ques1;

class MyThread extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(getName() + " running: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package Ques6;

public class Main {
    public static void main(String[] args) {

        MyInterface my = new MyClass();

        my.show();
        my.defaultMethod();
        MyInterface.staticMethod();
    }
}
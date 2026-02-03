sealed class Calculator permits Addition, Subtraction, Multiplication {

    public void calculate() {
        System.out.println("Calculating...");
    }
}
final class Addition extends Calculator {
    public void add(int a, int b) {
        System.out.println(a + b);
    }
}
sealed class Subtraction extends Calculator permits AdvancedSubtraction {
    public void sub(int a, int b) {
        System.out.println(a - b);
    }
}
non-sealed class Multiplication extends Calculator {
    public void multiply(int a, int b) {
        System.out.println(a * b);
    }
}

final class AdvancedSubtraction extends Subtraction {
    public void sub(int a, int b, int c) {
        System.out.println(a - b - c);
    }
}

public class Ques6 {
    public static void main(String[] args) {
        Calculator c1 = new Addition();
        Calculator c2 = new Subtraction();
        Calculator c3 = new Multiplication();

        ((Addition) c1).add(11, 6);
        ((Subtraction) c2).sub(12, 6);
        ((Multiplication) c3).multiply(8, 5);

    }
}
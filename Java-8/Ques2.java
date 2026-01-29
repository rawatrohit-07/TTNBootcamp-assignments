@FunctionalInterface
interface Arithmetic {
    int operations(int a, int b);
}
public class Ques2 {
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        Ques2 op = new Ques2();
        Arithmetic addition = op::add;
        Arithmetic subtraction = op::sub;
        Arithmetic multiplication = Ques2::multiply;

        System.out.println("Addition = " + addition.operations(5, 4));
        System.out.println("Subtraction = " + subtraction.operations(5, 4));
        System.out.println("Multiplication = " + multiplication.operations(5, 4));
    }
}

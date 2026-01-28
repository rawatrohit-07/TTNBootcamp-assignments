import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a: ");
            int a = sc.nextInt();

            System.out.print("Enter b: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Division Result: " + result);

            int[] arr = {10, 20, 30};
            System.out.print("Enter array index (0-2): ");
            int index = sc.nextInt();

            System.out.println("Array value: " + arr[index]);
        }

        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }

        finally {
            sc.close();
            System.out.println("Finally block executed.");
        }

        System.out.println("Program ended safely.");
    }
}

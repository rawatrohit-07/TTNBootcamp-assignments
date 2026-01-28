import java.util.Scanner;

class Ques3 {

    static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 3) {

            System.out.println("\nMenu");
            System.out.println("1. Calculate Area of Circle");
            System.out.println("2. Calculate Circumference of a Circle");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double r1 = sc.nextDouble();
                    System.out.println("Area of Circle: " + circleArea(r1));
                    break;

                case 2:
                    System.out.print("Enter radius: ");
                    double r2 = sc.nextDouble();
                    System.out.println("Circumference of Circle: " + circleCircumference(r2));
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1–3.");
            }
        }

        sc.close();
    }
}

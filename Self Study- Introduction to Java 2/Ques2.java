import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class User {
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;

    public User(String firstName, String lastName, int age, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String toFileString() {
        return firstName + "," + lastName + "," + age + "," + phoneNumber + "\n";
    }
}

class UserApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("User Creation Program");

        try (FileWriter fw = new FileWriter("SampleData.txt", true)) { // append mode

            while (true) {

                System.out.print("First name: ");
                String fn = sc.nextLine();

                System.out.print("Last name: ");
                String ln = sc.nextLine();

                System.out.print("Age: ");
                int age = Integer.parseInt(sc.nextLine());

                System.out.print("Phone Number: ");
                String phone = sc.nextLine();

                User user = new User(fn, ln, age, phone);

                fw.write(user.toFileString());
                fw.flush();

                System.out.println("✅ User saved successfully.");

                System.out.print("\nDo you want to continue creating users? (Type QUIT to exit): ");
                String choice = sc.nextLine();

                if (choice.equalsIgnoreCase("QUIT")) {
                    System.out.println("Program terminated.");
                    break;
                }
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        sc.close();
    }
}
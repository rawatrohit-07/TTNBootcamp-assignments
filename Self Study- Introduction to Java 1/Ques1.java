public class Ques1 {

    static class Profile {

        static String firstName = "Rohit";
        static String lastName = "Rawat";
        static int age = 25;

        static {
            System.out.println("First Name is : " + firstName);
        }

        static void printLastName() {
            System.out.println("Last Name is : " + lastName);
        }
    }

    public static void main(String[] args) {

        Profile.printLastName();
        System.out.println("Age is : " + Profile.age);
    }
}

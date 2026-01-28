
public class Ques8{

    public static void main(String[] args) {

        System.out.println("ClassNotFoundException Demo");

        try {
            Class.forName("com.fake.UnknownClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException occurred!");
            System.out.println(e);
        }

        System.out.println("\nNoClassDefFoundError Demo");

        Helper h = new Helper();
        h.show();
    }
}

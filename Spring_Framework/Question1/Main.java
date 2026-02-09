public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Developer developer = new Developer(laptop);

        developer.build();
    }
}

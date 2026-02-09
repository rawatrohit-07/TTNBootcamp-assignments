public class Main {
    public static void main(String[] args) {
        MachineCode desktop = new Desktop();
        Developer developer = new Developer(desktop);
        developer.build();
    }
}
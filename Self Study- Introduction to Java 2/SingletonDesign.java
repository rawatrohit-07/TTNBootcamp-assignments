public class SingletonDesign {
    private static SingletonDesign instance;

    private SingletonDesign() {
        System.out.println("Instance created");
    }

    public static SingletonDesign getInstance() {
        if(instance == null) {
            instance = new SingletonDesign();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonDesign in1 = SingletonDesign.getInstance();
        SingletonDesign in2 = SingletonDesign.getInstance();
        SingletonDesign in3 = SingletonDesign.getInstance();

        System.out.println(in1.hashCode());
        System.out.println(in2.hashCode());
        System.out.println(in3.hashCode());
    }
}
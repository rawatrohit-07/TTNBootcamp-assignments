
interface CallingFeature {

    default void feature() {
        System.out.println("Mobile supports voice calling");
    }
}
interface InternetFeature {

    default void feature() {
        System.out.println("Mobile supports internet browsing");
    }
}
class SmartPhone implements CallingFeature, InternetFeature {
    @Override
    public void feature() {
        System.out.println("Smartphone has multiple features");

        CallingFeature.super.feature();
        InternetFeature.super.feature();
    }
}
public class  Ques3 {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.feature();
    }
}

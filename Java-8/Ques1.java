
@FunctionalInterface
interface CompareNumbers {
    boolean isGreater(int a, int b);
}

@FunctionalInterface
interface IncrementNumber {
    int increment(int a);
}

@FunctionalInterface
interface ConcatStrings {
    String concat(String s1, String s2);
}

@FunctionalInterface
interface ToUpperCase {
    String convert(String s);
}

public class Ques1 {
    public static void main(String[] args) {

        CompareNumbers compare = (a, b) -> a > b;
        System.out.println("Is 15 greater than 8? " + compare.isGreater(15, 8));

        IncrementNumber inc = a -> a + 1;
        System.out.println("Incremented value of 10: " + inc.increment(10));

        ConcatStrings concatStr = (s1, s2) -> s1 + s2;
        System.out.println("Concatenated String: " + concatStr.concat("Risk", "Measurement"));

        ToUpperCase upper = s -> s.toUpperCase();
        System.out.println("Uppercase String: " + upper.convert("rohit rawat"));
    }
}

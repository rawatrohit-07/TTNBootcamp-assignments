import java.util.Optional;

public class Ques8 {
    public static void main(String[] args) {

        Optional<String> op = Optional.of("Rohit Rawat");
        if(op.isPresent()) {
            System.out.println("Name: " + op.get());
        }

        op.ifPresent(n -> System.out.println("Length: " + n.length()));
    }
}
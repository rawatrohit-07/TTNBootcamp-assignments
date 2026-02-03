import java.util.List;
import java.util.Optional;
import java.util.stream.*;

public class Ques1 {
    public static void main(String[] args) {
        Optional<Integer> opt = Optional.of(50);

        List<Integer> ans = opt.stream().toList();
        System.out.println(ans);
    }
}
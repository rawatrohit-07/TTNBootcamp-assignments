import java.util.Arrays;
import java.util.List;

public class Ques7 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19);
        int res = list.stream().filter(e -> e>5).mapToInt(e -> e).sum();
        System.out.println("sum of integers greater than 5 are: " + res);
    }
}
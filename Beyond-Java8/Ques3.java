import java.util.ArrayList;
import java.util.List;
public class Ques3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(66);
        list.add(25);
        list.add(78);
        list.add(28);
        List<Integer> ans=  list.stream().map(e -> e+1) . toList();
        System.out.println(ans);
    }
}

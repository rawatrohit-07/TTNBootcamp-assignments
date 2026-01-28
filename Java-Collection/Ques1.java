import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ques1 {
    public static void main(String[] args) {

        List<Float> res = new ArrayList<>();

        res.add(10.5f);
        res.add(8.5f);
        res.add(1.25f);
        res.add(9.56f);
        res.add(3.59f);

        float sum = 0.0f;

        Iterator<Float> it = res.iterator();

        while (it.hasNext()) {
            sum += it.next();
        }
        System.out.println("Sum of numbers in list using iterator: " + sum);
    }
}
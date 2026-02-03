import java.util.LinkedHashMap;
import java.util.SequencedMap;

public class Ques11 {
    public static void main(String[] args) {

        SequencedMap<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());

        map.putFirst(0, "Zero");
        map.putLast(4, "Four");

        System.out.println(map);

        System.out.println(map.pollFirstEntry());
        System.out.println(map.pollLastEntry());

        System.out.println(map);

        SequencedMap<Integer, String> reversedMap = map.reversed();
        System.out.println(reversedMap);

    }
}
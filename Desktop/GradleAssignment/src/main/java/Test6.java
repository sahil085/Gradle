import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Test6 {

    public static void main(String[] args) {
        int array[] = {1, 10, 3, 10, 3, 2, 3, 10, 2};
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        for (int i : array) {
            if (linkedHashMap.containsKey(i)) {
                linkedHashMap.put(i, linkedHashMap.get(i).intValue() + 1);

            } else {
                linkedHashMap.put(i, 1);

            }
        }
        List<Integer> list = new ArrayList<>(linkedHashMap.keySet());
        list.sort((obj1, obj2) -> linkedHashMap.get(obj2.intValue()) - linkedHashMap.get(obj1.intValue()));
        list.forEach(System.out::println);
    }
}

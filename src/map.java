import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] arg) {
        int[] arr = {1, 2, 2, 1, 3, 3, 3};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(i, map.get(arr[i]) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
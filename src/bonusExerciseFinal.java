import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class bonusExerciseFinal {

    public static void main(String[] args) {
        Map<Integer, Integer> someMap = new LinkedHashMap<>();
        someMap.put(6, 3);
        someMap.put(5, 6);
        someMap.put(4, 0);
        someMap.put(3, 0);
        someMap.put(2, 2);
        someMap.put(1, 7);
        someMap.put(0, 4);
        Map<Integer, Integer> someMap2 = new HashMap<>();
        someMap2.put(6, 6);
        someMap2.put(5, 6);
        someMap2.put(4, 7);
        someMap2.put(3, 0);
        someMap2.put(2, 7);
        someMap2.put(1, 5);
        someMap2.put(0, 3);
        showSum(someMap, someMap2);
    }

    private static void showSum(Map<Integer, Integer> someMap, Map<Integer, Integer> someMap2) {
        for (int i = someMap.size() - 1; i >= 2; i--) {
            if (someMap.get(i) != 0 || someMap2.get(i) != 0)
            System.out.printf("%dx^%d+", someMap.get(i)+someMap2.get(i),i);
        }
        if (someMap.size() >= 1) {
            System.out.printf("%dx+", someMap.get(1) + someMap2.get(1));
        }
        System.out.printf("%d", someMap.get(0)+someMap2.get(0));
    }
}
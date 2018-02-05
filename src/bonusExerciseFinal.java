import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class bonusExerciseFinal {

    public static void main(String[] args) {
        Map<Integer, Integer> polynomialOne = new LinkedHashMap<>();
        polynomialOne.put(6, 3);
        polynomialOne.put(5, 6);
        polynomialOne.put(4, 0);
        polynomialOne.put(3, 0);
        polynomialOne.put(2, 2);
        polynomialOne.put(1, 7);
        polynomialOne.put(0, 4);

        Map<Integer, Integer> polynomialTwo = new HashMap<>();
        polynomialTwo.put(6, 6);
        polynomialTwo.put(5, 6);
        polynomialTwo.put(4, 7);
        polynomialTwo.put(3, 0);
        polynomialTwo.put(2, 7);
        polynomialTwo.put(1, 5);
        polynomialTwo.put(0, 3);

        showPolynomial(unitePolynomials(polynomialOne, polynomialTwo));
    }

    private static Map<Integer, Integer> unitePolynomials(Map<Integer, Integer> someMap, Map<Integer, Integer> someMap2) {
        Map<Integer, Integer> finalPolynomial = new HashMap<>(someMap.size());
        for (int i = someMap.size() - 1; i >= 0; i--) {
            finalPolynomial.put(i, someMap.get(i) + someMap2.get(i));
        }
        return finalPolynomial;
    }

    private static void showPolynomial(Map<Integer, Integer> map) {
        for (int i = map.size() - 1; i >= 2; i--) {
            if (map.get(i) != 0 || map.get(i) != 0)
            System.out.printf("%dx^%d+", map.get(i), i);
        }
        if (map.size() > 1) {
            System.out.printf("%dx+", map.get(1));
        }
        System.out.printf("%d", map.get(0));
    }
}
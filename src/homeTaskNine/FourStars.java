package homeTaskNine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class FourStars {

    public static void main(String[] args) {
        List<String> listOfWords = new ArrayList<>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));

        markLength4(listOfWords);
    }

    private static void markLength4(List<String> tempList) {
        ListIterator<String> listIterator = tempList.listIterator();

        while (listIterator.hasNext()) {
            String s = listIterator.next();
            if (s.length() == 4) {
                listIterator.set("****");
                listIterator.add(s);
            }
        }
    }
}

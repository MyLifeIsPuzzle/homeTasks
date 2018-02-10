package homeTaskTen;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WordsRepeats {

    public static void main(String[] args) {
        String text = "Sherlock book, Holmes  a a first?, appeared in a       book called.'Study in Scarlet appeared";
        List<String> listOfWords = new LinkedList<>();
        Map<String, Integer> amountOfRepeats;

        text = text.replaceAll("(?U)[\\pP]", "");
        text = text.replaceAll("\\s+", " ");
        String[] stringArray = text.split(" ");

        listOfWords.addAll(Arrays.asList(stringArray));
        listOfWords.sort(new WordsComparator());

        amountOfRepeats = countRepeats(listOfWords);
    }

    private static Map<String, Integer> countRepeats(List<String> list) {
        Integer counter = 0;
        String tempString = list.get(0);
        Map<String, Integer> map = new HashMap<>();

        for (String string : list) {
            if (tempString.compareTo(string) != 0) {
                map.put(tempString, counter);
                tempString = string;
                counter = 1;
            } else {
                counter++;
            }
        }
        map.put(tempString, counter);

        return map;
    }

    private static class WordsComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }
}



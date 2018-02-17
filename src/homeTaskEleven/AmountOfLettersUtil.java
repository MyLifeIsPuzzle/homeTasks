package homeTaskEleven;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public final class AmountOfLettersUtil {

    public static final String NOT_LETTER = "(?U)[\\W\\d]";
    public static final String BLANK_SPACE = "";
    public static final int VALUE_TO_ADD = 1;

    private AmountOfLettersUtil() {
    }

    public static List<String> formatPoem(List<String> poem) {
        return poem.stream()
                .map(it -> it.replaceAll(NOT_LETTER, BLANK_SPACE))
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }

    public static Map<Character, Integer> countLetters(List<String> formattedPoem) {
        Map<Character, Integer> amountOfLetters = new TreeMap<>();

        formattedPoem.forEach(it -> {
            for (int i = 0; i < it.length(); i++) {
                amountOfLetters.merge(it.charAt(i), VALUE_TO_ADD, (valueOne, valueTwo) -> valueOne + valueTwo);
            }
        });

        return amountOfLetters;
    }

    public static List<String> convertMapToList(Map<Character, Integer> amountOfLettersMap) {
        List<String> amountOfLettersList = new ArrayList<>();

        amountOfLettersMap.forEach((key, value) -> amountOfLettersList.add(key + " - " + Integer.toString(value)));

        return amountOfLettersList;
    }
}


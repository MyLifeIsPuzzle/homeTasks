package homeTaskEleven;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class AmountOfLetters {

    public static void main(String[] args) throws IOException {
        List<String> poem = Files.readAllLines(Paths.get("src", "homeTaskEleven", "poem.txt"));

        List<String> formattedPoem = AmountOfLettersUtil.formatPoem(poem);

        Map<Character, Integer> amountOfLettersMap = AmountOfLettersUtil.countLetters(formattedPoem);

        List<String> amountOfLettersList = AmountOfLettersUtil.convertMapToList(amountOfLettersMap);

        Files.write(Paths.get("src", "homeTaskEleven", "amountOfLetters.txt"), amountOfLettersList);
    }
}

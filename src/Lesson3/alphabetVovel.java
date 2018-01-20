package Lesson3;

public class alphabetVovel {
    public static void main(String[] args) {
        for (char value = 'b'; !isVowel(value); value = (char) (value + 1)) {
            System.out.println(value);

        }
    }

    private static boolean isVowel(char value) {
        return value == 'a' || value == 'e' || value == 'i' || value == 'y' || value == 'o';
    }
}

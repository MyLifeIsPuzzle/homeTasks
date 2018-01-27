package homeTaskFour;

import java.util.Arrays;
import java.util.Random;

public class Duplicates {

    public static void main(String[] args) {
        Random random = new Random();
        final int ARRAY_SIZE = 10;
        int[] testArray = new int[ARRAY_SIZE];

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = random.nextInt(9) + 1;
        }
        System.out.println("With duplicates:\n" + Arrays.toString(testArray));
        System.out.println("New array without duplicates:\n" + Arrays.toString(deleteDuplicates(testArray)));
    }

    private static int[] deleteDuplicates(int[] testArray) {
        int counter = 0;
        for (int i = 0; i < testArray.length; i++) {
            for (int j = i; j < testArray.length; j++) {
                if ((testArray[i] == testArray[j]) && (i != j) && (testArray[i] != 0)) {
                    testArray[j] = 0;
                    counter++;
                }
            }
        }
        System.out.println("First array with 0 instead of duplicates:\n" + Arrays.toString(testArray));
        int[] arrayWithoutDuplicates = new int[testArray.length - counter];
        for (int i = 0, j = 0; i < testArray.length; i++) {
            if (testArray[i] != 0) {
                arrayWithoutDuplicates[j] = testArray[i];
                j++;
            }
        }
        return arrayWithoutDuplicates;
    }
}

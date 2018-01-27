package homeTaskFour;

import java.util.Arrays;
import java.util.Random;

public class MovementToTheRight {

    public static void main(String[] args) {
        Random random = new Random();
        final int AMOUNT_OF_MOVES = random.nextInt(5) + 5;
        int[] testArray = new int[random.nextInt(9) + 5];

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = random.nextInt(9) + 1;
        }

        System.out.println("Our array looks like that right now");
        System.out.println(Arrays.toString(testArray));
        System.out.printf("Let's make %d step(s) to the right, shell we?\n", AMOUNT_OF_MOVES);

        moveToTheRight(AMOUNT_OF_MOVES, testArray);
    }

    private static void moveToTheRight(int amountOfMoves, int[] testArray) {

        for (int i = 0; i < amountOfMoves; i++) {
            int lastNumberInArray = testArray[testArray.length - 1];
            for (int j = testArray.length; j > 1; j--) {
                testArray[j - 1] = testArray[j - 2];
            }
            testArray[0] = lastNumberInArray;
            System.out.println(Arrays.toString(testArray));
        }
    }
}

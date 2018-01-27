package homeTaskFour;

import java.util.Arrays;
import java.util.Random;

public class ArraysUnion {

    public static void main(String[] args) {
        Random random = new Random();
        final int ARRAY_ONE_SIZE = random.nextInt(10);
        final int ARRAY_TWO_SIZE = random.nextInt(10);
        int[] arrayOne = new int[ARRAY_ONE_SIZE];
        int[] arrayTwo = new int[ARRAY_TWO_SIZE];

        for (int i = 0; i < ARRAY_ONE_SIZE; i++) {
            arrayOne[i] = random.nextInt(9) + 1;
        }
        for (int i = 0; i < ARRAY_TWO_SIZE; i++) {
            arrayTwo[i] = random.nextInt(9) + 1;
        }

        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));

        uniteArrays(arrayOne, arrayTwo);
    }

    private static void uniteArrays(int[] arrayOne, int[] arrayTwo) {
        final int ARRAY_THREE_SIZE = arrayOne.length + arrayTwo.length;
        int[] arrayThree = new int[ARRAY_THREE_SIZE];
        int counter = 0;

        for (int i = 0; (i < arrayOne.length) && (i < arrayTwo.length); i++) {
            arrayThree[counter] = arrayOne[i];
            arrayThree[counter + 1] = arrayTwo[i];
            counter += 2;
        }

        counter = 0;
        if (arrayOne.length > arrayTwo.length) {
            for (int i = arrayTwo.length; i < arrayOne.length; i++) {
                arrayThree[arrayTwo.length * 2 + counter] = arrayOne[i];
                counter++;
            }
            System.out.println(Arrays.toString(arrayThree));
        } else {
            for (int i = arrayOne.length; i < arrayTwo.length; i++) {
                arrayThree[arrayOne.length * 2 + counter] = arrayTwo[i];
                counter++;
            }
            System.out.println(Arrays.toString(arrayThree));
        }
    }
}

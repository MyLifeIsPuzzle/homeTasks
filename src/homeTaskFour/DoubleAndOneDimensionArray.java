package homeTaskFour;

import java.util.Arrays;
import java.util.Random;

public class DoubleAndOneDimensionArray {

    public static void main(String[] args) {
        Random random = new Random();
        int[][] doubleDimensionalArray = new int[random.nextInt(5) + 1][];
        int singleDimensionalArraySize = 0;

        for (int i = 0; i < doubleDimensionalArray.length; i++) {
            doubleDimensionalArray[i] = new int[random.nextInt(5) + 1];
            for (int j = 0; j < doubleDimensionalArray[i].length; j++) {
                doubleDimensionalArray[i][j] = random.nextInt(9) + 1;
                System.out.print(doubleDimensionalArray[i][j]);
                singleDimensionalArraySize++;
            }
            System.out.println("\r");
        }
        System.out.println(Arrays.toString(toSingleDimensionalArray(singleDimensionalArraySize, doubleDimensionalArray)));
    }

    private static int[] toSingleDimensionalArray(int singleDimensionalArraySize, int[][] doubleDimensionalArray) {
        int[] singleDimensionalArray = new int[singleDimensionalArraySize];
        for (int i = 0, k = 0; i < doubleDimensionalArray.length; i++) {
            for (int j = 0; j < doubleDimensionalArray[i].length; j++) {
                singleDimensionalArray[k] = doubleDimensionalArray[i][j];
                k++;
            }
        }
        return singleDimensionalArray;
    }
}
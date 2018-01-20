package Lesson3;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        int minNumber = 99999;
        for (int i = 0; i < 10; i++) {
            int randomValue = random.nextInt(50) + 1;
            System.out.println(randomValue);
            if (minNumber > randomValue) {
                minNumber = randomValue;
            }
        }
        System.out.println("minValue="+minNumber);
    }
}

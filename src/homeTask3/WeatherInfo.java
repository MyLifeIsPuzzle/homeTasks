package homeTask3;

import java.util.Scanner;

public class WeatherInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAmountOfRain = 0;
        int maxAmountOfRainPerDay = 0;

        System.out.println("Enter number of days");
        int numberN = scanner.nextInt();
        while (numberN <= 0) {
            System.out.println("Invalid number, please enter integer number > 0");
        }
        for (int i = 1; i <= numberN; i++) {
            System.out.printf("Enter amount of rain for day №%d ", i);
            int amountOfRainForCurrentDay = scanner.nextInt();
            while (amountOfRainForCurrentDay < 0) {
                System.out.println("Invalid number, please enter an integer number >= 0");
                System.out.printf("Enter amount of rain for day №%d ", i);
                amountOfRainForCurrentDay = scanner.nextInt();
            }
            totalAmountOfRain += amountOfRainForCurrentDay;
            if (amountOfRainForCurrentDay > maxAmountOfRainPerDay) {
                maxAmountOfRainPerDay = amountOfRainForCurrentDay;
            }
        }

        System.out.printf("Number of days: %d\n", numberN);
        System.out.printf("Total amount of rain: %d\n", totalAmountOfRain);
        System.out.printf("Max amount of rain per day: %d\n", maxAmountOfRainPerDay);
        System.out.printf("Average amount of rain: %.3f\n", (double) (totalAmountOfRain / numberN));
    }
}

package homeTaskThree;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        SumDigits();
    }

    private static void SumDigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any integer number");
        int number = scanner.nextInt();
        int sum = 0;
        int lastDigit;
        while (number != 0) {
            lastDigit = number % 10;
            number /= 10;
            sum += lastDigit;
        }
        System.out.println("Sum of digits = " + (sum >= 0 ? sum : (sum - sum * 2)));
    }
}

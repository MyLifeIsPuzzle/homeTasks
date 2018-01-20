package Lesson3;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = scanner.nextInt();
        System.out.printf("Is the number %d simple?\nIt's " + simpleOrNot(number, 2), number);
    }

    public static boolean simpleOrNot(int x, int firstNumberForStep) {
        if (firstNumberForStep <= 7) {
            if (x % firstNumberForStep == 0 && firstNumberForStep != x) {
                return false;
            }
            firstNumberForStep++;
            return simpleOrNot(x, firstNumberForStep);
        } else return true;
    }
}

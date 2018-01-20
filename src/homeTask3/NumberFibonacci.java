package homeTask3;

import java.util.Scanner;

public class NumberFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive integer number");
        int number = scanner.nextInt();
        int nextNumber;
        int currentNumber = 1;
        int previousNumber = 0;

        System.out.println(previousNumber); // Выводим первый 0

        while (currentNumber < number) {
            nextNumber = currentNumber + previousNumber;
            previousNumber = currentNumber;
            currentNumber = nextNumber;
            System.out.println(previousNumber);
        }

        // РЕКУРСИЯ
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive integer number");
        int number = scanner.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.println(firstNumber);
        recursiaMethod(secondNumber, firstNumber, number);*/

    }

    /*public static void recursiaMethod(int currentNumber, int previousNumber, int number) {
        int nextNumber = currentNumber + previousNumber;
        previousNumber = currentNumber;
        currentNumber = nextNumber;
        System.out.println(previousNumber);
        if (currentNumber > number) {
            return;
        } else {
            recursiaMethod(currentNumber, previousNumber, number);
        }
    }*/
}

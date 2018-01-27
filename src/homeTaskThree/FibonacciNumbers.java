package homeTaskThree;

import java.util.Scanner;

public class FibonacciNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any positive integer number that limits the biggest Fibonacci number");
        int upperLimit = scanner.nextInt();
        int nextNumber;
        int currentNumber = 1;
        int previousNumber = 0;

        System.out.println(previousNumber); // Выводим первый 0

        while (currentNumber < upperLimit) {
            nextNumber = currentNumber + previousNumber;
            previousNumber = currentNumber;
            currentNumber = nextNumber;
            System.out.println(previousNumber);
        }

        // РЕКУРСИЯ
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any positive integer number that limits the biggest Fibonacci number");
        int number = scanner.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.println(firstNumber);
        generateFibonacciUsingRecursion(secondNumber, firstNumber, number);
*/
    }

    public static void generateFibonacciUsingRecursion(int currentNumber, int previousNumber, int number) {
        int nextNumber = currentNumber + previousNumber;
        previousNumber = currentNumber;
        currentNumber = nextNumber;
        System.out.println(previousNumber);
        if (currentNumber > number) {
            return;
        } else {
            generateFibonacciUsingRecursion(currentNumber, previousNumber, number);
        }
    }
}

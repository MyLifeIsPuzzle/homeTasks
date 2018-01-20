package homeTask2;

import java.util.Scanner;

public class FindRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double firstRoot;
        final double secondRoot;

        System.out.print("Enter a:");
        double a = scanner.nextDouble();
        while (a == 0) {
            System.out.println("'a' cannot be 0. Enter a valid number.");
            a = scanner.nextDouble();
        }

        System.out.print("Enter b:");
        double b = scanner.nextDouble();

        System.out.print("Enter c:");
        double c = scanner.nextDouble();

        double discriminantValue = discriminant(a, b, c);
        System.out.printf("Discriminant = %.3f\n", discriminantValue);

        if (!isPositive(discriminantValue)) {
            System.out.println("No roots");
        } else if (isZero(discriminantValue)) {
            firstRoot = -b / (2 * a);
            //secondRoot = firstRoot;
            System.out.printf("2 equal roots = %.3f", firstRoot);
        } else {
            firstRoot = (-b + Math.sqrt(discriminantValue)) / (2 * a);
            secondRoot = (-b - Math.sqrt(discriminantValue)) / (2 * a);
            System.out.printf("2 roots: %.3f and %.3f", firstRoot, secondRoot);
        }
    }

    private static double discriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    private static boolean isPositive(double number) {
        return number >= 0;
    }

    private static boolean isZero(double number) {
        return number == 0;
    }
}
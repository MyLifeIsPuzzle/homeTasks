package homeTask2;

import java.util.Scanner;

public class TwoHouses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the rectangle (example 2,5): ");
        double rectangleWidth = scanner.nextDouble();
        while (rectangleWidth <= 0) {
            System.out.println("Invalid width! Please enter another number > 0");
            rectangleWidth = scanner.nextDouble();
        }

        System.out.print("Enter the height of the rectangle (example 2,5): ");
        double rectangleHeight = scanner.nextDouble();
        while (rectangleHeight <= 0) {
            System.out.println("Invalid height! Please enter another number > 0");
            rectangleHeight = scanner.nextDouble();
        }

        System.out.print("Enter the width of the 1st house (example 2,5): ");
        double firstHouseWidth = scanner.nextDouble();
        while (firstHouseWidth <= 0 || firstHouseWidth > rectangleWidth) {
            System.out.printf("Invalid width or it is bigger than rectangles width! Please enter another number > 0 and <= %.3f", rectangleWidth);
            firstHouseWidth = scanner.nextDouble();
        }

        System.out.print("Enter the height of the 1st house (example 2,5): ");
        double firstHouseHeight = scanner.nextDouble();
        while (firstHouseHeight <= 0 || firstHouseHeight > rectangleHeight) {
            System.out.printf("Invalid height or it is bigger than rectangles height! Please enter another number > 0 and <= %.3f", rectangleHeight);
            firstHouseHeight = scanner.nextDouble();
        }

        System.out.print("Enter the width of the 2nd house (example 2,5): ");
        double secondHouseWidth = scanner.nextDouble();
        while (secondHouseWidth <= 0 || secondHouseWidth > rectangleWidth) {
            System.out.printf("Invalid width  or it is bigger than rectangles width! Please enter another number > 0 and <= %.3f", rectangleWidth);
            secondHouseWidth = scanner.nextDouble();
        }

        System.out.print("Enter the height of the 2nd house (example 2,5): ");
        double secondHouseHeight = scanner.nextDouble();
        while (secondHouseHeight <= 0 || secondHouseHeight > rectangleHeight) {
            System.out.printf("Invalid height or it is bigger than rectangles height! Please enter another number > 0 and <= %.3f", rectangleHeight);
            secondHouseHeight = scanner.nextDouble();
        }

        if (((firstHouseHeight + secondHouseHeight) <= rectangleHeight) || ((firstHouseWidth + secondHouseWidth) <= rectangleWidth)) {
            System.out.println("This houses fit the rectangle");
        } else {
            System.out.println("This houses DON'T fit the rectangle");
        }
    }
}


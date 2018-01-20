package Lesson2;

import java.util.Scanner;


public class yearsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
            if (year % 100 != 0) {
                System.out.println("Високосный");
            } else if (year % 100 == 0) {
                if (year % 400 != 0) {
                    System.out.println("Не високосный");
                } else {
                    System.out.println("Високосный");
                }
            }

        /*if (isLeapYear(year)) {
            System.out.println("Високосный");
        } else {
            System.out.println("Не високосный");


        }*/
    }

    /*private static boolean isLeapYear(int year) {
        boolean result = false;
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }*/
}
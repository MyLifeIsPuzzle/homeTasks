package homeTask2;

import java.util.Scanner;

public class DayMonthYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year.");
        int year = scanner.nextInt();
        boolean isItALeapYear = leapYear(year);

        System.out.println("Enter the month (1-12)");
        int month = scanner.nextInt();
        while (month < 1 || month > 12) {
            System.out.println("Invalid month! Please enter another number");
            month = scanner.nextInt();
        }

        if (month != 2 && month != 4 && month != 6 && month != 9 && month != 11) {
            System.out.println("Enter the day (1 - 31)");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Enter the day (1 - 30)");
        } else if (isItALeapYear) {
            System.out.println("Enter the day (1 - 29)");
        } else {
            System.out.println("Enter the day (1 - 28)");
        }

        int day = scanner.nextInt();
        while (day < 1 || day > 31 || (day == 31 && (month == 4 || month == 6 || month == 9 || month == 11)) || (isItALeapYear && day > 29 && month == 2) || (!isItALeapYear && day > 28 && month == 2)) {
            System.out.println("Invalid day! Please enter another number.");
            day = scanner.nextInt();
        }

        dateFormatting(day, month, year);

        System.out.println("Adding a day to the current date...");
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day < 31) {
                    day++;
                } else {
                    month++;
                    day = 1;
                }
                break;
            case 2:
                if (day < 28) {
                    day++;
                } else {
                    if ((day == 28 && !isItALeapYear) || (day == 29 && isItALeapYear)) {
                        month++;
                        day = 1;
                    } else {
                        day++;
                    }
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 30) {
                    day++;
                } else {
                    month++;
                    day = 1;
                }
                break;
            case 12:
                if (day < 31) {
                    day++;
                } else {
                    month = 1;
                    day = 1;
                    year++;
                }
                break;
        }
        dateFormatting(day, month, year);
    }

    public static void dateFormatting(int day, int month, int year) {
        if (month < 10) {
            System.out.printf("Current date is %d.0%d.%d\n", day, month, year);
        } else {
            System.out.printf("Current date is %d.%d.%d\n", day, month, year);
        }
    }

    private static boolean leapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}


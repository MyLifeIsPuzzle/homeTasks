package Lesson3;

import java.util.Scanner;

public class NumberSumDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int value = scanner.nextInt();
        int sum = 0;
        for (; value != 0;) {
            int ostatok = value % 10;
            value /= 10;
            sum += ostatok;
        }
       /* while (value / 10 >= 1) {
            sum += value % 10;
            value /= 10;
        }
        sum += value % 10;*/
        System.out.println(sum);
    }
}

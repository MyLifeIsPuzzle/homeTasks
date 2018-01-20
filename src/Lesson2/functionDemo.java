package Lesson2;

import java.util.Scanner;

public class functionDemo {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int first = scanner.nextInt();
       int second = scanner.nextInt();
       int third = scanner.nextInt();
       cube(first);

        System.out.println(cube(first));
    }

    private static int cube(int first) {
        return (int) Math.pow(first,3);
    }

    private static int getMaxValue(int first, int second) {
        return first > second ? first : second;
    }
}

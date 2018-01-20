package Lesson2;

import java.util.Scanner;

public class moveLetter {
    public static void main(String[] args) {
        char c = 'a';
        int offset = 5;
        System.out.println(test(c, offset));
        System.out.println((int) c);
    }

    private static char test(char c, int offset) {
        return (char) (c + offset);
    }
}

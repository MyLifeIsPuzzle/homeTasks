package homeTaskFive;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        System.out.println("Enter a string:");
        builder.append(scanner.next());
        System.out.println("Is this string a palindrome?\n" + isPalindrome(builder));
    }

    private static boolean isPalindrome (StringBuilder builder) {
        return builder.toString().equalsIgnoreCase(builder.reverse().toString());
    }
}

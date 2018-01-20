package Lesson2;

import java.util.Scanner;

public class Season {
    public static void main(String[] argc) {
        Scanner scanner = new Scanner(System.in);

        int monthNumber = scanner.nextInt();

        if ((monthNumber >= 1 && monthNumber <= 2) || monthNumber == 12) {
            System.out.println("Winter");
        } else if (monthNumber >= 3 && monthNumber <=5){
            System.out.println("Spring");
        } else if (monthNumber >= 6 && monthNumber <=8){
            System.out.println("Summer");
        } else if (monthNumber >= 9 && monthNumber <=11){
            System.out.println("Outumn");
        } else {
            System.out.println("Error");
        }

    }
}

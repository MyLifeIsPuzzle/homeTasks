package Lesson2;

import java.util.Scanner;

public class RubleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moneyAmount = scanner.nextInt();

        /*switch (moneyAmount) {
            case 1:
            case 12:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Outumn");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Spring");
                break;
            default:
                System.out.println("Error");*/

        //}

        if (moneyAmount % 10 == 1 && moneyAmount % 100 != 11){
            System.out.println(moneyAmount + " рубль");
        } else if (moneyAmount % 10 >= 2 && moneyAmount % 10 <= 4 && !(moneyAmount % 100 >= 12 &&moneyAmount % 100 <= 14)) {
            System.out.println(moneyAmount + " рубля");
        } else {
            System.out.println(moneyAmount + " рублей");
        }
        /*switch (moneyAmount) {
            case (moneyAmount % 10 == 1 && moneyAmount % 100 != 11):
                System.out.println(moneyAmount + " рубль");
                break;
            case (moneyAmount % 10 >= 2 && moneyAmount % 10 <= 4 && !(moneyAmount % 100 >= 12 && moneyAmount % 100 <= 14)):
                System.out.println(moneyAmount + " рубля");
                break;
            default:
                System.out.println(moneyAmount + " рублей");  */


    }
}

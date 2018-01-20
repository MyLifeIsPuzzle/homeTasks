package Lesson3;

import java.sql.SQLOutput;

public class MoneyForCity {
    public static void main(String[] args) {
        System.out.println(factCount(5));







        /* int factNumber = 5;
        int factValue = 1;
        int whileFactNumber = 5;
        int whileFactValue = 1;
        int whileStep = 1;
        for (int i = 1; i <= factNumber; i++) {
            factValue *= i;
            System.out.printf("Current value for i = %s is %s\n", i, factValue);
        }
        while (whileStep <= whileFactNumber) {
            whileFactValue *= whileStep;
            System.out.printf("Current value for i = %s is %s\n", whileStep, whileFactValue);
            whileStep++;
        }*/
    }

    /* public static void testFor() {
         int firstYear = 1626;
         double firstPrize = 24;
         int currentYear = 1750;
         double percentPerYear = 0.05;
         double currentAmount;

         System.out.printf("Money amount: %s", firstPrize);

         for (; firstYear <= currentYear; firstYear++) {
             if (firstYear == 1700) {
                 continue;
             }
             currentAmount = firstPrize * percentPerYear;
             firstPrize += currentAmount;
             System.out.printf("In %s year amount was of percenteges was %.2f. Total amount: %.2f\n", firstYear, currentAmount, firstPrize);
         }
     }*/
    static int factCount(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * factCount(x - 1);
        }
    }
}

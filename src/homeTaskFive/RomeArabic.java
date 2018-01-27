package homeTaskFive;

public class RomeArabic {

    public static void main(String[] args) {
        String someString = "CMMMXXIXIV";
        int finalArabicNumber = getFinalArabicNumber(someString);
        System.out.println(finalArabicNumber);
    }

    private static int getFinalArabicNumber(String someString) {
        int finalArabicNumber = 0;
        for (int i = 0; i < someString.length(); i++) {
            int currentDigit = turnRomanToArabic(someString.charAt(i));
            if (i == someString.length() - 1) {
                finalArabicNumber += currentDigit;
                break;
            }
            int nextDigit = turnRomanToArabic(someString.charAt(i + 1));
            if (currentDigit >= nextDigit) {
                finalArabicNumber += currentDigit;
            } else {
                finalArabicNumber += nextDigit - currentDigit;
                i++;
            }
        }
        return finalArabicNumber;
    }


    public static int turnRomanToArabic(char romanDigit) {
        int arabicNumber = 0;
        switch (romanDigit) {
            case 'I':
                arabicNumber = 1;
                break;
            case 'V':
                arabicNumber = 5;
                break;
            case 'X':
                arabicNumber = 10;
                break;
            case 'L':
                arabicNumber = 50;
                break;
            case 'C':
                arabicNumber = 100;
                break;
            case 'D':
                arabicNumber = 500;
                break;
            case 'M':
                arabicNumber = 1000;
                break;
        }
        return arabicNumber;
    }
}

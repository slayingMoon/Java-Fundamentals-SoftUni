package Methods_Exercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            if (isDivisibleBy8(i) && hasOddDigit(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean hasOddDigit(int number) {
        while (number > 0){
            int digit = number % 10;
            number/=10;
            if (digit % 2 != 0){
                return true;
            }
        }
        return false;
    }

    private static boolean isDivisibleBy8(int number) {
        int sumDigits = 0;
        while (number > 0){
            int digit = number % 10;
            sumDigits+=digit;
            number/=10;
        }
        return sumDigits % 8 == 0;
    }
}

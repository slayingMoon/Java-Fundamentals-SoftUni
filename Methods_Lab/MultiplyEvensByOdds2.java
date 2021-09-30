package Methods_Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getResult(number));
    }

    private static int getResult(int n) {
         int evenSum = getSumEvens(n);
         int oddSum = getSumOdds(n);
         return evenSum * oddSum;
    }

    private static int getSumOdds(int n) {
        int sumOdds = 0;
        while (n > 0){
            int digit = n % 10;
            if (digit%2 != 0) {
                sumOdds+=digit;
            }
            n /= 10;
        }
        return sumOdds;
    }

    private static int getSumEvens(int n) {
        int sumEvens = 0;
        while (n > 0){
            int digit = n % 10;
            if (digit%2 == 0) {
                sumEvens+=digit;
            }
            n /= 10;
        }
        return sumEvens;
    }
}

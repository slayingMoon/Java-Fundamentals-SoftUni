package Methods_Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println(getResult(number));
    }

    private static int getResult(int number) {
        int sumEvens = 0;
        int sumOdds = 0;
        while (number > 0){
            int digit = number % 10;
            if (digit%2 == 0){
                sumEvens+=digit;
            }else {
                sumOdds+=digit;
            }
            number/=10;
        }
        return sumEvens*sumOdds;
    }
}

package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sumEvens = 0;
        int sumOdds = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sumEvens += number;
            } else {
                sumOdds += number;
            }
        }
        System.out.println(sumEvens-sumOdds);
    }
}

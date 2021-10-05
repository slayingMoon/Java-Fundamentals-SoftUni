package Methods_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopNumber2 {
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
        int[] nums = Arrays.stream(String.valueOf(number).split("")).mapToInt(Integer::parseInt).toArray();
        for (int num : nums) {
            if (num % 2 != 0){
                return true;
            }
        }
        return false;
    }

    private static boolean isDivisibleBy8(int number) {
        int sumDigits = Arrays.stream(String.valueOf(number).split("")).mapToInt(Integer::parseInt).sum();
        return sumDigits % 8 == 0;
    }
}

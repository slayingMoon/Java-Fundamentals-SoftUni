package Methods_Exercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!"END".equals(input = scanner.nextLine())){
            System.out.println(checkIsPalindrome(input));
        }
    }

    private static boolean checkIsPalindrome(String input) {
        String reverse = new StringBuilder(input).reverse().toString();
        return input.equals(reverse);
    }
}

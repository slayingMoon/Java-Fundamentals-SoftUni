package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int sumDigits = 0;

        for (int i = 0; i < number.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(number.charAt(i)));
            sumDigits+=digit;
        }
        System.out.println(sumDigits);
    }
}

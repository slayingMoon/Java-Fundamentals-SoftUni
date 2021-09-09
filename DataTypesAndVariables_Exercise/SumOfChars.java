package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int asciiSum = 0;

        for (int i = 0; i < numberOfLines; i++) {
            char letter = scanner.nextLine().charAt(0);
            asciiSum+=letter;
        }
        System.out.println("The sum equals: " + asciiSum);
    }
}

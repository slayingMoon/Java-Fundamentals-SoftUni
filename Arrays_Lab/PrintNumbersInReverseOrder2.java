package Arrays_Lab;

import java.util.Scanner;

public class PrintNumbersInReverseOrder2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersCount = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[numbersCount];

        for (int i = 0; i < numbersCount; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            numbers[i] = number;
        }

        for (int i = numbersCount - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}

package Methods_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestOfThreeNumbers3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println(findSmallest(numbers));
    }

    private static int findSmallest(int[] numbers) {
        int smallest = Arrays.stream(numbers).min().getAsInt();
        return smallest;
    }
}

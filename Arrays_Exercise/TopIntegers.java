package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < numbers.length; i++) {
            boolean isTopInteger = true;
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] <= numbers[j]) {
                        isTopInteger = false;
                    }
                }
                if (isTopInteger){
                    System.out.print(numbers[i] + " ");
            }
        }
    }
}

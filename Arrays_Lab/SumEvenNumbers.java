package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        for (int number = 0; number < numbers.length; number++) {
            if (numbers[number] % 2 == 0){
                sum+=numbers[number];
            }
        }
        System.out.println(sum);
    }
}

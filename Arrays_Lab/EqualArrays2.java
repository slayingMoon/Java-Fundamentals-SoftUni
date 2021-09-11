package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] array2 = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                System.out.println("Arrays are not identical. Found difference at " + i + " index.");
                return;
            } else {
                sum += array1[i];
            }
        }

        System.out.println("Arrays are identical. Sum: " + sum);

    }
}

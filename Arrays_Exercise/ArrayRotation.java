package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations; i++) {
            int firstElement = numbers[0];
            //shift left
            for (int j = 0; j < numbers.length-1; j++) {
                numbers[j] = numbers[j+1];
            }
            numbers[numbers.length-1] = firstElement;
        }
        //print output
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int longestSequence = 0;
        int digit = 0;
        int sequence = 1;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] == numbers[i-1]){
                sequence++;

                if (sequence>longestSequence){
                    longestSequence = sequence;
                    digit = numbers[i];
                }
            }else {
                sequence = 1;
            }
        }
        for (int i = 0; i < longestSequence; i++) {
            System.out.print(digit + " ");
        }
    }
}

package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        while (numbers.length>1){
            //TODO: create new Array
            int[] condensed = new int[numbers.length-1];
            //TODO: create for loop to iterate through numbers
            for (int i = 0; i < numbers.length-1; i++) {
                condensed[i] = numbers[i] + numbers[i+1];
            }
            numbers = condensed;
        }
        System.out.println(numbers[0]);
    }
}

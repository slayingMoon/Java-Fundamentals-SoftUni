package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int magicNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == magicNumber){
                    System.out.println(numbers[i] + " " + numbers[j]);
                    break;
                }
            }
        }
    }
}

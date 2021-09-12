package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < numbers.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            //sumRight
            for (int j = i+1; j < numbers.length; j++) {
                sumRight+=numbers[j];
            }
            //sumLeft
            for (int k = i-1; k >= 0; k--) {
                sumLeft+=numbers[k];
            }

            if (sumLeft == sumRight){
                System.out.println(i);
                return;
            }
        }
        System.out.println("no");
    }
}

package Arrays_MoreExercise;

import java.util.Scanner;

public class RecursiveFibonacci4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wantedNumber = Integer.parseInt(scanner.nextLine());
        int[] fibonacciSequence = new int[50];

        fibonacciSequence[0] = 1;
        fibonacciSequence[1] = 1;

        if (wantedNumber > 2){
            for (int i = 2; i < wantedNumber; i++) {
                fibonacciSequence[i] = fibonacciSequence[i-1] + fibonacciSequence[i-2];
            }
        }
        System.out.println(fibonacciSequence[wantedNumber-1]);
    }
}

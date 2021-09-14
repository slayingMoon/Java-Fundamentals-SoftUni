package Arrays_MoreExercise;

import java.util.Scanner;

public class RecursiveFibonacci2 {
    private static long[] memo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        memo = new long[n+1];
        System.out.println(recursiveFibonacciMemorization(n));
    }
    private static long recursiveFibonacciMemorization(int n){
        if (n <= 2){
            return 1;
        }
        if (memo[n] != 0){
            return memo[n];
        }
        memo[n] = recursiveFibonacciMemorization(n-1) + recursiveFibonacciMemorization(n-2);
        return memo[n];
    }
}

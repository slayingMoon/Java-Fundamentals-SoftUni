package Arrays_MoreExercise;

import java.util.Scanner;

public class RecursiveFibonacci3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(recursiveFibonacci(n));
    }
    private static long recursiveFibonacci(int n){
        if (n <= 2){
            return 1;
        }
        return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
    }
}

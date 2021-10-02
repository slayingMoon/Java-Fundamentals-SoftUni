package Methods_Exercise;

import java.util.Scanner;

public class FactorialDivision2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f", (double) calculateFactorial(num1)/calculateFactorial(num2));
    }

    private static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial*=i;
        }
        return factorial;
    }
}

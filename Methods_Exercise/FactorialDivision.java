package Methods_Exercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        long factorialNum1 = calculateFactorial(num1);
        long factorialNum2 = calculateFactorial(num2);

        System.out.printf("%.2f", calculateFactorialDivision(factorialNum1, factorialNum2));
    }

    private static double calculateFactorialDivision(long factorialNum1, long factorialNum2) {
        return (double) factorialNum1/factorialNum2;
    }

    private static long calculateFactorial(int num) {
        long factorial = 1;
        for (int i = num; i >= 1; i--) {
            factorial*=i;
        }
        return factorial;
    }
}

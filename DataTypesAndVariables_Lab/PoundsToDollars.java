package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        double pounds = new Scanner(System.in).nextDouble();
        System.out.printf("%.3f", (double)pounds*1.36);
    }
}

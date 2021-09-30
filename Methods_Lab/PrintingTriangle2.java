package Methods_Lab;

import java.util.Scanner;

public class PrintingTriangle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            printLine(i);
        }
        for (int i = n-1; i >= 1; i--) {
            printLine(i);
        }
    }

    private static void printLine(int end) {
        for (int j = 1; j <= end; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

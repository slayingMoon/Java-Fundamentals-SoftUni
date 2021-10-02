package Methods_Exercise;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            printRows(number);
        }

    }
    private static void printRows(int number){
        for (int i = 0; i < number; i++) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

}

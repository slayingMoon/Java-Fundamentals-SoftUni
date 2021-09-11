package Arrays_Lab;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        for (int i = input.length-1; i >= 0; i--) {
            System.out.print(input[i] + " ");
        }
    }
}

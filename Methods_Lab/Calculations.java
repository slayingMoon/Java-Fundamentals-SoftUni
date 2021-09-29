package Methods_Lab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        switch (command){
            case "add":
                printAddition(num1, num2);
                break;
            case "subtract":
                printSubtraction(num1, num2);
                break;
            case "multiply":
                printMultiplication(num1, num2);
                break;
            case "divide":
                printDivision(num1, num2);
                break;
        }
    }

    private static void printDivision(int num1, int num2) {
        System.out.println(num1/num2);
    }

    private static void printMultiplication(int num1, int num2) {
        System.out.println(num1*num2);
    }

    private static void printSubtraction(int num1, int num2) {
        System.out.println(num1-num2);
    }

    private static void printAddition(int num1, int num2) {
        System.out.println(num1+num2);
    }
}

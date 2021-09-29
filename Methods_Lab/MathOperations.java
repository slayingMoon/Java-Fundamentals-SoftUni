package Methods_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = Double.parseDouble(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double num2 = Double.parseDouble(scanner.nextLine());
        System.out.println(new DecimalFormat("0.####").format(getResult(num1,num2, operator)));

    }

    private static double getResult(double num1, double num2, char operator) {
        double result = 0;
        switch (operator){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        return result;
    }
}

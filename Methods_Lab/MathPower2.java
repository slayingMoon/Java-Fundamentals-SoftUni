package Methods_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        System.out.println(new DecimalFormat("0.####").format(calculateMathPower(number,power)));
    }

    private static double calculateMathPower(double number, int power) {
        return Math.pow(number,power);
    }
}

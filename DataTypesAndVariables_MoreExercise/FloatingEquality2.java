package DataTypesAndVariables_MoreExercise;

import java.util.Scanner;

public class FloatingEquality2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double eps = 0.000001;
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        boolean isEqual = Math.abs(a - b) < eps;

        if (isEqual) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}

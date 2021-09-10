package DataTypesAndVariables_MoreExercise;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double eps = 0.000001;
        double a = 0;
        double b = 0;

        while (true){
            a = Double.parseDouble(scanner.nextLine());
            b = Double.parseDouble(scanner.nextLine());
            boolean isEqual = Math.abs(a-b) < eps;

            if (isEqual){
                System.out.println("True");
                return;
            }else {
                System.out.println("False");
                return;
            }
        }
    }
}

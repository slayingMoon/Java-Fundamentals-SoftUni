package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch = scanner.nextLine().charAt(0);

        if (ch == Character.toUpperCase(ch)){
            System.out.println("upper-case");
        }else {
            System.out.println("lower-case");
        }
    }
}

package Methods_Exercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int result = sumNumbers(first,second);

        System.out.println(subtractNumbers(result, third));
    }
    public static int sumNumbers(int num1, int num2){
        return num1 + num2;
    }
    public static int subtractNumbers(int sum, int third){
        return sum - third;
    }
}

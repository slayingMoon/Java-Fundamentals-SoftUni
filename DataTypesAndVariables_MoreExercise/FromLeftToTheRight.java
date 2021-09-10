package DataTypesAndVariables_MoreExercise;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            double leftNum = Double.parseDouble(scanner.next());
            double rightNum = Double.parseDouble(scanner.next());

            int sumDigits = 0;
            if (leftNum>rightNum){
                double num1 = Math.abs(leftNum);

                while (num1 > 0){
                    sumDigits+=num1%10;
                    num1/=10;
                }
            }else {
                double num2 = Math.abs(rightNum);

                while (num2 > 0){
                    sumDigits+=num2%10;
                    num2/=10;
                }
            }
            System.out.println(Math.abs(sumDigits));
        }
    }
}

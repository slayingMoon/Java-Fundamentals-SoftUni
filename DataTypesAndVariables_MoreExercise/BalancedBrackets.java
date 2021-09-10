package DataTypesAndVariables_MoreExercise;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int openCount = 0;
        int closeCount = 0;

        for (int i = 1; i <= numberOfLines; i++) {
            String input = scanner.nextLine();

            if (input.equals("(")){
                openCount++;
            }else if (input.equals(")")){
                closeCount++;
                if (openCount - closeCount != 0){
                    break;
                }
            }
        }

        if (openCount == closeCount){
            System.out.println("BALANCED");
        }else {
            System.out.println("UNBALANCED");
        }
    }
}

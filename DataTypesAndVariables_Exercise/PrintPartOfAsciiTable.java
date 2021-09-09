package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class PrintPartOfAsciiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startIndex = Integer.parseInt(scanner.nextLine());
        int endIndex = Integer.parseInt(scanner.nextLine());

        for (int i = startIndex; i <= endIndex; i++) {
            char symbol = (char) i;
            if (i!=endIndex){
                System.out.print(symbol+" ");
            }else {
                System.out.print(symbol);
            }

        }
    }
}

package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class TriplesOfLatinLetters2 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        for (int firstChar = 'a'; firstChar <'a' + n; firstChar++) {
            for (int secondChar = 'a'; secondChar <'a' + n ; secondChar++) {
                for (int thirdChar = 'a'; thirdChar <'a' +n; thirdChar++) {
                    System.out.printf("%c%c%c%n", firstChar,secondChar,thirdChar);
                }
            }
        }
    }
}

package DataTypesAndVariables_MoreExercise;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int charsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < charsCount; i++) {
            char currentChar = scanner.nextLine().charAt(0);
            char decrypted = (char) (currentChar + key);
            System.out.print(decrypted);
        }
    }
}

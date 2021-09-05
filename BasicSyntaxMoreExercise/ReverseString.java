package BasicSyntaxMoreExercise;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length()-1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        System.out.println(reversed);
    }
}

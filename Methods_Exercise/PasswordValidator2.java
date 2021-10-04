package Methods_Exercise;

import java.util.Scanner;

public class PasswordValidator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean isBetween = checkIsBetween(input);
        boolean containsLettersDigits = containsLettersAndDigits(input);
        boolean hasEnoughDigits = hasTwoDigits(input);
        if (isBetween && containsLettersDigits && hasEnoughDigits){
            System.out.println("Password is valid");
        }
        if (!isBetween){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!containsLettersDigits){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!hasEnoughDigits){
            System.out.println("Password must have at least 2 digits");
        }

    }
    private static boolean checkIsBetween(String password){
        return password.length() >= 6 && password.length() <= 10;
    }
    private static boolean containsLettersAndDigits(String passowrd){
        for (int i = 0; i < passowrd.length(); i++) {
            if (!Character.isLetterOrDigit(passowrd.charAt(i))){
                return false;
            }
        }
        return true;
    }
    private static boolean hasTwoDigits(String password){
        int digits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))){
                digits++;
            }
        }
        return digits >= 2;
    }
}

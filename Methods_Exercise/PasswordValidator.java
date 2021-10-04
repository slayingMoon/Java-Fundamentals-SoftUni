package Methods_Exercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (checkIsBetween(input) && containsLettersAndDigits(input) && hasTwoDigits(input)){
            System.out.println("Password is valid");
        }
        if (!checkIsBetween(input)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!containsLettersAndDigits(input)){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!hasTwoDigits(input)){
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

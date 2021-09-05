package BasicSyntaxExercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        StringBuilder password = new StringBuilder();
        String input = scanner.nextLine();

        for (int i = username.length()-1; i >= 0; i--) {
            password.append(username.charAt(i));
        }
        int tries = 1;
        while (!input.equals(password.toString())){
            if (tries == 4){
                System.out.println("User " + username + " blocked!");
                return;
            }
            System.out.println("Incorrect password. Try again.");
            tries++;
            input = scanner.nextLine();
        }
            System.out.println("User " + username + " logged in.");
    }
}

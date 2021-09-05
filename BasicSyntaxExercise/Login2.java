package BasicSyntaxExercise;

import java.util.Scanner;

public class Login2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        StringBuilder password = new StringBuilder();


        for (int i = username.length()-1; i >= 0; i--) {
            password.append(username.charAt(i));
        }
        boolean isLogged = false;

        for (int tries = 1; tries <= 4; tries++) {
            String passInput = scanner.nextLine();
            if (passInput.equals(password.toString())){
                isLogged = true;
                System.out.printf("User %s logged in.", username);
                break;
            }
            if (tries<=3) {
                System.out.println("Incorrect password. Try again.");
            }
        }

        if (!isLogged){
            System.out.printf("User %s blocked!", username);
        }
    }
}

package BasicSyntaxMoreExercise;

import java.util.Scanner;

public class Messages2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int buttonsCount = Integer.parseInt(scanner.nextLine());
        StringBuilder message = new StringBuilder();

        for (int i = 0; i < buttonsCount; i++) {
            String typedDigits = scanner.nextLine();

            int digitLength = typedDigits.length();
            int mainDigit = Character.getNumericValue(typedDigits.charAt(0));

            int pushCounter=0;
            if (mainDigit == 8 || mainDigit == 9){
                pushCounter = (mainDigit - 2) * 3 + 1;
            }else {
                pushCounter = (mainDigit - 2) * 3;
            }
            pushCounter = pushCounter+digitLength-1;

            int asciiCode = 0;
            if (mainDigit == 0){
                asciiCode = 32;
            }else {
                asciiCode = pushCounter + 97;
            }
            char letter = (char) asciiCode;
            message.append(letter);
        }
        System.out.println(message);
    }
}

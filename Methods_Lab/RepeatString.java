package Methods_Lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int repeatCount = Integer.parseInt(scanner.nextLine());
        System.out.println(getRepeatedString(input, repeatCount));
    }

    private static StringBuilder getRepeatedString(String input, int repeatCount) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeatCount; i++) {
            sb.append(input);
        }
        return sb;
    }
}

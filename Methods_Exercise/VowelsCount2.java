package Methods_Exercise;

import java.util.Scanner;

public class VowelsCount2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("");
        System.out.println(vowelsCount(input));
    }

    private static int vowelsCount(String[] input) {
        String vowels = "aeiouAEIOU";
        int vowelCounter = 0;

        for (String s : input) {
            if (vowels.contains(s)){
                vowelCounter++;
            }
        }
        return vowelCounter;
    }
}

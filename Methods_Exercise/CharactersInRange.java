package Methods_Exercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char startingChar = scanner.nextLine().charAt(0);
        char endingChar = scanner.nextLine().charAt(0);
        if (startingChar < endingChar) {
            getChars(startingChar, endingChar);
        }else {
            getChars(endingChar, startingChar);
        }
    }
    private static void getChars(char start, char end){
        for (int i = start+1; i < end; i++) {
            System.out.print((char) i + " ");
        }
    }
}

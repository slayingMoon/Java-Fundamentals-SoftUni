package Arrays_MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStrings = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[numberOfStrings];

        for (int i = 0; i < numberOfStrings; i++) {
            String name = scanner.nextLine();
            int sumEncryption = 0;
            for (int j = 0; j < name.length(); j++) {
                char currentChar = name.charAt(j);
                //check if Vowel or Consonant
                if (isVowel(currentChar)){
                    sumEncryption += currentChar * name.length();
                }else {
                    sumEncryption += currentChar / name.length();
                }
            }
            //write encrypted name in array
            numbers[i] = sumEncryption;
        }
        //exit for loop
        //sort values in array
        Arrays.sort(numbers);
        //print values
        for (int number : numbers) {
            System.out.println(number);
        }

    }
    public static boolean isVowel(char c){
        String vowels = "aeiouAEIOU";
        return vowels.contains(c + "");
    }
}

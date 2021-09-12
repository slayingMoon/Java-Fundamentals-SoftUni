package Arrays_Exercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array1 = scanner.nextLine().split("\\s+");
        String[] array2 = scanner.nextLine().split("\\s+");

        for (int i = 0; i < array2.length; i++) {
            String currentWord = array2[i];
            for (int j = 0; j < array1.length; j++) {
                if (currentWord.equals(array1[j])){
                    System.out.print(currentWord + " ");
                }
            }
        }
    }
}

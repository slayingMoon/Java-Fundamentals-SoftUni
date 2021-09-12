package Arrays_Exercise;

import java.util.Scanner;

public class CommonElements2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array1 = scanner.nextLine().split("\\s+");
        String[] array2 = scanner.nextLine().split("\\s+");

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array2[i].equals(array1[j])){
                    System.out.print(array2[i] + " ");
                    break;
                }
            }
        }
    }
}

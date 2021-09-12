package Arrays_Exercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        String[] array1 = new String[lines];
        String[] array2 = new String[lines];

        for (int i = 0; i < lines; i++) {
            String[] arr = scanner.nextLine().split("\\s+");
            if (i % 2 ==0){
                array1[i] = arr[0];
                array2[i] = arr[1];
            }else {
                array1[i] = arr[1];
                array2[i] = arr[0];
            }
        }
        for (String s : array1) {
            System.out.print(s+" ");
        }
        System.out.println();
        for (String b : array2) {
            System.out.print(b + " ");
        }
    }
}

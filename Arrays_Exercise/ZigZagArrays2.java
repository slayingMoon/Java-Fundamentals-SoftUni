package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            int[] input = Arrays
                    .stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (i%2 == 0){
                arr1[i] = input[0];
                arr2[i] = input[1];
            }else {
                arr1[i] = input[1];
                arr2[i] = input[0];
            }
        }
        System.out.println(Arrays.toString(arr1).replace(",", "").replace("[", "").replace("]", ""));
        System.out.println(Arrays.toString(arr2).replace(",", "").replace("[", "").replace("]", ""));
    }
}

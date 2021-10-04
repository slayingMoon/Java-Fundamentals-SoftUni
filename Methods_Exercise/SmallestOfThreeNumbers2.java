package Methods_Exercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int smallestFirstCheck = findSmallest(num1,num2);
        int smallestFinalCheck = findSmallest(smallestFirstCheck, num3);

        System.out.println(smallestFinalCheck);

    }
    private static int findSmallest(int a, int b){
        return Math.min(a, b);
    }
}

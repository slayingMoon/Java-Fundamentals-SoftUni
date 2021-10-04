package Methods_Exercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        System.out.println(returnSmallestNumber(num1,num2,num3));
    }

    private static int returnSmallestNumber(int num1, int num2, int num3) {
        int smallestNum = 0;
        if (num1<num2 && num1<num3){
            smallestNum = num1;
        }else if (num2<num1 && num2<num3){
            smallestNum = num2;
        }else {
            smallestNum = num3;
        }
        return smallestNum;
    }
}

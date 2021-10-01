package Methods_Lab;

import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printSign(number);
    }
    static void printSign(int num){
        if (num > 0){
            System.out.println("The number " + num + " is positive.");
        }else if (num < 0){
            System.out.println("The number " + num + " is negative.");
        }else {
            System.out.println("The number " + num + " is zero.");
        }
    }
}

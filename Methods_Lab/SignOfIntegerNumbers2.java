package Methods_Lab;

import java.util.Scanner;

public class SignOfIntegerNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String sign = "";

        System.out.println(getNumberSign(number, sign));
    }
    static String getNumberSign(int number, String sign){
        if (number > 0){
            sign = "The number " + number + " is positive.";
            return sign;
        }else if (number < 0){
            sign = "The number " + number + " is negative.";
        }else {
            sign = "The number " + number + " is zero.";
            return sign;
        }
        return sign;
    }
}

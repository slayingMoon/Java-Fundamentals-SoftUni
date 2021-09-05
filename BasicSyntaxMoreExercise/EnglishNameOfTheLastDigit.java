package BasicSyntaxMoreExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(getLastDigit(number));
    }
    private static String getLastDigit(int n){
        int lastDigit = n%10;
        Map<Integer, String> integerStringMap = new HashMap<>();

        integerStringMap.put(0, "zero");
        integerStringMap.put(1, "one");
        integerStringMap.put(2, "two");
        integerStringMap.put(3, "three");
        integerStringMap.put(4, "four");
        integerStringMap.put(5, "five");
        integerStringMap.put(6, "six");
        integerStringMap.put(7, "seven");
        integerStringMap.put(8, "eight");
        integerStringMap.put(9, "nine");

        return integerStringMap.get(lastDigit);
    }
}

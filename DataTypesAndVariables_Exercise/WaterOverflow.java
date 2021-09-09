package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int totalLitres = 0;

        for (int i = 0; i < numberOfLines; i++) {
            int litresToAdd = Integer.parseInt(scanner.nextLine());
            if (totalLitres+litresToAdd <= 255){
                totalLitres+=litresToAdd;
            }else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(totalLitres);
    }
}

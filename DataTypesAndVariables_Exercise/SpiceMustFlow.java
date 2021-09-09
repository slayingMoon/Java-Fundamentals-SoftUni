package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int totalAmountExtracted = 0;
        int daysOperated = 0;
        while (startingYield >= 100){
            int spiceRemaining = startingYield - 26;
            totalAmountExtracted+=spiceRemaining;
            daysOperated++;
            startingYield-=10;
        }
        if (totalAmountExtracted-26 >= 0){
            totalAmountExtracted-=26;
        }
        System.out.println(daysOperated);
        System.out.println(totalAmountExtracted);
    }
}

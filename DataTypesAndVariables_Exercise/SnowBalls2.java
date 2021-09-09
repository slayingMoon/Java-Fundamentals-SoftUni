package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class SnowBalls2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberSnowballs = Integer.parseInt(scanner.nextLine());
        long highestSnowballValue = 0;
        int bestSnow = 0;
        int bestTime = 0;
        int bestQuality = 0;

        for (int i = 0; i < numberSnowballs; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            long totalValue = (long) Math.pow(snowballSnow/snowballTime, snowballQuality);
            if (totalValue > highestSnowballValue){
                highestSnowballValue = totalValue;
                bestSnow = snowballSnow;
                bestTime = snowballTime;
                bestQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %d (%d)", bestSnow, bestTime, highestSnowballValue, bestQuality);
    }
}

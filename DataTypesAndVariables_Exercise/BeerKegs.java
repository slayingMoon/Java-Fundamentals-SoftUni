package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linesOfInput = Integer.parseInt(scanner.nextLine());
        String biggestKeg = "";
        double biggestVolume = 0;

        for (int i = 0; i < linesOfInput; i++) {
            String kegModel = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double currentVolume = Math.PI*(radius*radius)*height;
            if (currentVolume>biggestVolume){
                biggestVolume = currentVolume;
                biggestKeg = kegModel;
            }
        }
        System.out.println(biggestKeg);
    }
}

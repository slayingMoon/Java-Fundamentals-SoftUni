package BasicSyntaxMoreExercise;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currentBalance = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double totalMoneySpent = 0;

        while (!input.equals("Game Time")){
            String game = input;
            double price = 0;
            double moneySpent = 0;

            switch (game){
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    if (currentBalance - price < 0){
                        System.out.println("Too Expensive");
                    }else {
                        currentBalance-=price;
                        moneySpent+=price;
                        System.out.printf("Bought %s%n", game);
                    }
                    break;
                case "CS: OG":
                    price = 15.99;
                    if (currentBalance - price < 0){
                        System.out.println("Too Expensive");
                    }else {
                        currentBalance-=price;
                        moneySpent+=price;
                        System.out.printf("Bought %s%n", game);
                    }
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    if (currentBalance - price < 0){
                        System.out.println("Too Expensive");
                    }else {
                        currentBalance-=price;
                        moneySpent+=price;
                        System.out.printf("Bought %s%n", game);
                    }
                    break;
                case "Honored 2":
                    price = 59.99;
                    if (currentBalance - price < 0){
                        System.out.println("Too Expensive");
                    }else {
                        currentBalance-=price;
                        moneySpent+=price;
                        System.out.printf("Bought %s%n", game);
                    }
                    break;
                case "RoverWatch":
                    price = 29.99;
                    if (currentBalance - price < 0){
                        System.out.println("Too Expensive");
                    }else {
                        currentBalance-=price;
                        moneySpent+=price;
                        System.out.printf("Bought %s%n", game);
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }

            totalMoneySpent+=moneySpent;
            if (currentBalance == 0) {
                System.out.println("Out of money!");
                return;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f%n", totalMoneySpent, currentBalance);
    }
}

package BasicSyntaxMoreExercise;

import java.util.Scanner;

public class GamingStore3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currentBalance = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double totalMoneySpent = 0;
        boolean isOutOfMoney = false;

        while (!input.equals("Game Time")){
            String game = input;
            double price = 0;
            String boughtGame = String.format("Bought %s", game);

            switch (game){
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                default:
                    System.out.println("Not Found");
                    input = scanner.nextLine();
                    continue;
            }
            if (currentBalance < price){
                System.out.println("Too Expensive");
            }else {
                System.out.println(boughtGame);
                currentBalance-=price;
                totalMoneySpent+=price;
            }

            if (currentBalance == 0){
                System.out.println("Out of money!");
                isOutOfMoney = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (!isOutOfMoney){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f%n", totalMoneySpent, currentBalance);
        }
    }
}

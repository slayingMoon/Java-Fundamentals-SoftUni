package BasicSyntaxExercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalMoneyInserted = 0;

        while (!input.equals("Start")){
            double money = Double.parseDouble(input);
            if (money != 0.1 && money != 0.2 && money != 0.5 && money != 1 && money != 2){
                System.out.printf("Cannot accept %.2f%n", money);
            }else {
                totalMoneyInserted+=money;
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        double remainingMoney = totalMoneyInserted;

        while (!input.equals("End")){
            String product = input;
            double price = 0;
            switch (product){
                case "Nuts":
                    price = 2;
                    if (remainingMoney-price < 0){
                        System.out.println("Sorry, not enough money");
                    }else {
                        System.out.println("Purchased " + product);
                        remainingMoney-=price;
                    }
                    break;
                case "Water":
                    price = 0.7;
                    if (remainingMoney-price < 0){
                        System.out.println("Sorry, not enough money");
                    }else {
                        System.out.println("Purchased " + product);
                        remainingMoney-=price;
                    }
                    break;
                case "Crisps":
                    price = 1.5;
                    if (remainingMoney-price < 0){
                        System.out.println("Sorry, not enough money");
                    }else {
                        System.out.println("Purchased " + product);
                        remainingMoney-=price;
                    }
                    break;
                case "Soda":
                    price = 0.8;
                    if (remainingMoney-price < 0){
                        System.out.println("Sorry, not enough money");
                    }else {
                        System.out.println("Purchased " + product);
                        remainingMoney-=price;
                    }
                    break;
                case "Coke":
                    price = 1;
                    if (remainingMoney-price < 0){
                        System.out.println("Sorry, not enough money");
                    }else {
                        System.out.println("Purchased " + product);
                        remainingMoney-=price;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", remainingMoney);
    }
}

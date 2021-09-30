package Methods_Lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        calculateProductPrice(product, quantity);
    }

    private static void calculateProductPrice(String product, int quantity) {
        double total = 0;
        switch (product){
            case "coffee":
                total = quantity*1.50;
                break;
            case "water":
                total = quantity*1.00;
                break;
            case "coke":
                total = quantity*1.40;
                break;
            case "snacks":
                total = quantity*2.00;
                break;
        }
        System.out.printf("%.2f", total);
    }
}

package BasicSyntaxExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();
        double totalPrice = 0;

        switch (groupType){
            case "Students":
                if (day.equals("Friday")){
                    totalPrice = numberOfPeople*8.45;
                    if (numberOfPeople >= 30){
                        totalPrice-=totalPrice*0.15;
                    }
                }else if (day.equals("Saturday")){
                    totalPrice = numberOfPeople*9.80;
                    if (numberOfPeople >= 30){
                        totalPrice-=totalPrice*0.15;
                    }
                }else if (day.equals("Sunday")){
                    totalPrice = numberOfPeople*10.46;
                    if (numberOfPeople >= 30){
                        totalPrice-=totalPrice*0.15;
                    }
                }
                break;
            case "Business":
                if (day.equals("Friday")){
                    totalPrice = numberOfPeople*10.90;
                    if (numberOfPeople >= 100){
                        totalPrice-=10*10.90;
                    }
                }else if (day.equals("Saturday")){
                    totalPrice = numberOfPeople*15.60;
                    if (numberOfPeople >= 100){
                        totalPrice-=10*15.60;
                    }
                }else if (day.equals("Sunday")){
                    totalPrice = numberOfPeople*16;
                    if (numberOfPeople >= 100){
                        totalPrice-=10*16;
                    }
                }
                break;
            case "Regular":
                if (day.equals("Friday")){
                    totalPrice = numberOfPeople*15;
                    if (numberOfPeople >= 10 && numberOfPeople <= 20){
                        totalPrice-=totalPrice*0.05;
                    }
                }else if (day.equals("Saturday")){
                    totalPrice = numberOfPeople*20;
                    if (numberOfPeople >= 10 && numberOfPeople <= 20){
                        totalPrice-=totalPrice*0.05;
                    }
                }else if (day.equals("Sunday")){
                    totalPrice = numberOfPeople*22.50;
                    if (numberOfPeople >= 10 && numberOfPeople <= 20){
                        totalPrice-=totalPrice*0.05;
                    }
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}

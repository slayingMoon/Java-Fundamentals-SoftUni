package BasicSyntaxExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double pricePerSabre = Double.parseDouble(scanner.nextLine());
        double pricePerRobe = Double.parseDouble(scanner.nextLine());
        double pricePerBelt = Double.parseDouble(scanner.nextLine());

        int requiredSabres = (int) Math.ceil(studentsCount*1.1);
        int freeBelts = 0;
        int counter = 0;
        for (int i = 0; i < studentsCount; i++) {
            counter++;
            if (counter == 6){
                freeBelts++;
                counter=0;
            }

        }
        double totalCost = pricePerSabre*requiredSabres + pricePerBelt*(studentsCount-freeBelts) + pricePerRobe*studentsCount;

        if (totalCost<=money){
            System.out.printf("The money is enough - it would cost %.2flv.", totalCost);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",totalCost-money);
        }
    }
}

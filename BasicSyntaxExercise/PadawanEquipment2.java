package BasicSyntaxExercise;

import java.util.Scanner;

public class PadawanEquipment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //inputData
        double money = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double pricePerSabre = Double.parseDouble(scanner.nextLine());
        double pricePerRobe = Double.parseDouble(scanner.nextLine());
        double pricePerBelt = Double.parseDouble(scanner.nextLine());

        //calculatedData
        double sabresTotalPrice = Math.ceil(studentsCount*1.1)*pricePerSabre;
        double robesTotalPrice = pricePerRobe*studentsCount;

        int freeBelts = studentsCount/6;
        double beltsTotalPrice = pricePerBelt*(studentsCount - freeBelts);

        double totalCost = sabresTotalPrice + robesTotalPrice + beltsTotalPrice;
        //Output
        if (totalCost <= money){
            System.out.printf("The money is enough - it would cost %.2flv.", totalCost);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",totalCost-money);
        }
    }
}

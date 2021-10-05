package Methods_MoreExercise;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        switch (type){
            case "int":
                int number = Integer.parseInt(scanner.nextLine());
                int result = number*2;
                System.out.println(result);
                break;
            case "real":
                double doubleNum = Double.parseDouble(scanner.nextLine());
                double doubleResult = doubleNum*1.5;
                System.out.printf("%.2f", doubleResult);
                break;
            case "string":
                String text = scanner.nextLine();
                String strResult = "$" + text + "$";
                System.out.println(strResult);
                break;
        }
    }
}

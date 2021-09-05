package BasicSyntaxLab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int hoursInMinutes = hours*60;
        int timeAfter30 = hoursInMinutes + minutes+30;

        int finalHours = timeAfter30/60;
        int finalMinutes = timeAfter30%60;

        if (finalHours == 24){
            finalHours = 0;
        }


        System.out.printf("%d:%02d", finalHours, finalMinutes);
    }
}

package BasicSyntaxExercise;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = startNumber; i <= endNumber; i++) {
            sum+=i;
            if (i!=endNumber){
                System.out.print(i + " ");
            }else {
                System.out.println(i);
            }
        }
        System.out.println("Sum: " + sum);
    }
}

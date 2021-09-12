package Arrays_Exercise;

import java.util.Scanner;

public class Train2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagonsCount = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[wagonsCount];
        int people = 0;

        for (int i = 0; i < wagonsCount; i++) {
            wagons[i] = Integer.parseInt(scanner.nextLine());
            people+=wagons[i];
        }
        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }

        System.out.print("\n" + people);
    }
}

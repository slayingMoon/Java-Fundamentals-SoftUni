package Arrays_Exercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagonsCount = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[wagonsCount];
        int totalPeople = 0;

        for (int i = 0; i < wagonsCount; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            wagons[i] = people;
            totalPeople+=people;
        }
        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }

        System.out.print("\n" + totalPeople);
    }
}

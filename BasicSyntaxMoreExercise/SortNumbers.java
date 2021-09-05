package BasicSyntaxMoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        List<Integer> nums = new ArrayList<>();
        nums.add(num1);
        nums.add(num2);
        nums.add(num3);

        nums.stream()
                .sorted((n1,n2)-> n2.compareTo(n1))
                .forEach(w-> System.out.println(w));

    }
}

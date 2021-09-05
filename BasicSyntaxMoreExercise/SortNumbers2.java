package BasicSyntaxMoreExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SortNumbers2 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            nums.add(Integer.parseInt(read.readLine()));
        }
        nums.stream()
                .sorted((n1,n2)->n2.compareTo(n1))
                .forEach(System.out::println);
    }
}

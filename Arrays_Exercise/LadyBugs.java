package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int filedSize = Integer.parseInt(scanner.nextLine());
        int[] field = new int[filedSize];
        int[] bugPositions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String input = "";
        for (int bugPosition : bugPositions) {
            field[bugPosition] = 1;
        }
        while (!"end".equals(input = scanner.nextLine())) {
            String[] details = input.split("\\s+");
            int bugIndex = Integer.parseInt(details[0]);
            String direction = details[1];
            int flyLength = Integer.parseInt(details[2]);

            if (bugIndex < 0 || bugIndex > field.length - 1) {
                break;
            } else {
                //if (bugIndex + flyLength <= field.length-1) {
                    switch (direction) {
                        case "right":
                            if (bugIndex!=field.length-1) {
                                if (field[bugIndex + flyLength] != 1) {
                                    field[bugIndex] = 0;
                                    field[bugIndex + flyLength] = 1;
                                } else {
                                    flyLength += flyLength;
                                    if (bugIndex + flyLength <= field.length - 1) {
                                        field[bugIndex] = 0;
                                        field[bugIndex + flyLength] = 1;
                                    }
                                }
                            }else {
                                field[bugIndex] = 0;
                            }
                            break;
                        case "left":
                            if (bugIndex != 0) {
                                if (field[bugIndex - flyLength] != 1 && bugIndex - flyLength >= 0) {
                                    field[bugIndex] = 0;
                                    field[bugIndex - flyLength] = 1;
                                } else {
                                    flyLength += flyLength;
                                    if (bugIndex - flyLength >= 0) {
                                        field[bugIndex] = 0;
                                        field[bugIndex - flyLength] = 1;
                                    }
                                }
                            }else {
                                field[bugIndex] = 0;
                            }
                            break;
                    }
              // }

            }
        }
        //Output
        for (int i : field) {
            System.out.print(i + " ");
        }
    }
}

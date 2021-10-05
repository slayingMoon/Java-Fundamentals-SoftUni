package Methods_MoreExercise;

import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        if (findDiagonal(x1,y1) <= findDiagonal(x2,y2)){
            System.out.printf("(%d, %d)", x1,y1);
        }else {
            System.out.printf("(%d, %d)", x2,y2);
        }
    }
    private static double findDiagonal(int x, int y){
        double a = x;
        double b = y;
        return Math.sqrt(Math.abs((Math.pow(a, 2)) +(Math.pow(b,2))));
    }
}

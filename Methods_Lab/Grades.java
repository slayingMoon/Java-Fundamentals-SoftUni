package Methods_Lab;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        String type = "";
        System.out.println(returnGradeType(grade, type));
    }
    static String returnGradeType(double grade, String type){
        if (grade >= 2.00 && grade <= 2.99){
            return "Fail";
        }else if (grade >= 3.00 && grade <= 3.49){
            return "Poor";
        }else if (grade >=3.50 && grade <= 4.49){
            return "Good";
        }else if (grade >= 4.50 && grade <= 5.49){
            return "Very good";
        }else if (grade >= 5.50 && grade <= 6.00){
            return "Excellent";
        }
        return "";
    }
}

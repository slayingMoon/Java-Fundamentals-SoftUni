package BasicSyntaxExercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //inputData
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        //calculateData
        int trashedKeyboardCount = 0;
        int trashedDisplayCount = 0;
        int trashedHeadsetCount = 0;
        int trashedMouseCount = 0;
        for (int losses = 1; losses <= lostGames; losses++) {
            if (losses%2 ==0){
                trashedHeadsetCount++;
            }
            if (losses%3==0){
                trashedMouseCount++;
            }
            if (losses%2==0 && losses%3==0) {
            trashedKeyboardCount += 1;
                if (trashedKeyboardCount % 2 == 0){
                trashedDisplayCount+=1;
                }
            }
        }
        //outputData
        double totalExpenses = headsetPrice*trashedHeadsetCount + mousePrice*trashedMouseCount + keyboardPrice*trashedKeyboardCount + displayPrice*trashedDisplayCount;
        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);
    }
}

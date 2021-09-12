package Arrays_Exercise;

import java.util.Scanner;

public class KaminoFactory3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sequenceLength = Integer.parseInt(scanner.nextLine());
        //Declare input variable
        String input = "";
        //Output Sequence
        StringBuilder outputSequence = new StringBuilder();
        //Which DNA sample will be printed
        int bestDNAIndex = 0;
        int bestDNAIndexOuput = 0;
        int leftMostIndex = Integer.MAX_VALUE;
        int bestDNASum = 0;

        while (!"Clone them!".equals(input = scanner.nextLine())){
            //Reading first DNA sequence
            bestDNAIndex++;
            //create a String array to save the input data
            String[] array = input.split("!+");
            //make int array to convert data to numbers
            int[] numArray = new int[sequenceLength];
            //fill the numArray
            for (int i = 0; i < array.length; i++) {
                numArray[i] = Integer.parseInt(array[i]);
            }
            //Declare var to store longest sequence of ones
            int longestSequence = 0;
            //Declare var to write currentIndex
            int currentIndex = 0;
            //Compare the values in the array
            for (int i = 0; i < numArray.length; i++) {
                //Declare var currentSequence of ones
                int currentSequence = 0;
                for (int j = i; j < numArray.length; j++) {
                    if (numArray[i] == numArray[j]){
                        currentSequence++;
                        //check if currentSequence is bigger than longesSequence
                        if (currentSequence>longestSequence){
                            longestSequence = currentSequence;
                            //Store current index in variable
                            currentIndex = i;
                        }
                    }else {
                        break;
                    }
                }
            }
            //Declare variable for the currentSum
            int currentSum = 0;
            //Iterate through numArray and increase the currentSum if the value is 1
            for (int i = 0; i < numArray.length; i++) {
                if (numArray[i] == 1){
                    currentSum++;
                }
            }
            //Check for leftmostIndex and highestSum
            if (currentIndex < leftMostIndex || currentSum > bestDNASum){
                leftMostIndex = currentIndex;
                bestDNASum = currentSum;
                bestDNAIndexOuput = bestDNAIndex;
                //Overwrite the stringbuilder after the first SB is filled
                outputSequence = new StringBuilder();
                for (int i = 0; i < numArray.length; i++) {
                    outputSequence.append(numArray[i]).append(" ");
                }
            }
        }
        //print the Output
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestDNAIndexOuput, bestDNASum);
        System.out.println(outputSequence.toString().trim());
    }
}

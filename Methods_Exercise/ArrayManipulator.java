package Methods_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String input = "";
        while (!"end".equals(input = scanner.nextLine())){
            //manipulation Array to store the manipulation data
            String[] command = input.split("\\s+");
            //check the different command cases
            switch (command[0]){
                case "exchange":
                    int positionToExchange = Integer.parseInt(command[1]);
                    //check if index is inside the array boundaries
                    if (positionToExchange >= 0 && positionToExchange < numbers.length){
                        exchange(numbers, positionToExchange);
                    }else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    String numType = command[1];
                    int index = -1;
                    //check even or odd
                    if (numType.equals("odd")){
                        //number%2==1 Odd
                        index = maxEvenOrOddIndex(numbers, 1);
                        System.out.println(index);
                    }else {
                        //numer%2==0 Even
                        index = maxEvenOrOddIndex(numbers, 0);
                        System.out.println(index);
                    }
                    //if no max even/odd element => No matches
                    if (index == -1){
                        System.out.println("No matches");
                    }
                    break;
                case "min":
                    numType = command[1];
                    index = -1;
                    //check even or odd
                    if (numType.equals("odd")){
                        //number%2==1 Odd
                        index = minEvenOrOddIndex(numbers, 1);
                    }else {
                        //numer%2==0 Even
                        index = minEvenOrOddIndex(numbers, 0);
                    }
                    //if no max even/odd element => No matches
                    if (index == -1){
                        System.out.println("No matches");
                    }else {
                        System.out.println(index);
                    }
                    break;
                case "first":
                    int count = Integer.parseInt(command[1]);
                    //check if count is greater than the array length
                    if (count > numbers.length){
                        System.out.println("Invalid count");
                        break;
                    }
                    numType = command[2];
                    //create array to store the resulting array (needed for the output)
                    int[] result = new int[0];
                    //check even/odd
                    if (numType.equals("odd")){
                        result = firstEvenOrOddElements(numbers, count, 1);
                    }else {
                        result = firstEvenOrOddElements(numbers, count, 0);
                    }
                    //print Resulting array
                    System.out.println(Arrays.toString(result));
                    break;
                case "last":
                    count = Integer.parseInt(command[1]);
                    //check if count is greater than the array length
                    if (count > numbers.length){
                        System.out.println("Invalid count");
                        break;
                    }
                    numType = command[2];
                    //create array to store the resulting array (needed for the output)
                    result = new int[0];
                    //check even/odd
                    if (numType.equals("odd")){
                        result = lastEvenOrOddElements(numbers, count, 1);
                    }else {
                        result = lastEvenOrOddElements(numbers, count, 0);
                    }
                    //print Resulting array
                    System.out.println(Arrays.toString(result));
                    break;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    private static int[] lastEvenOrOddElements(int[] arr, int requiredCount, int divisionResult) {
        int[] resultArr = new int[requiredCount];
        int currentCounter = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] % 2 == divisionResult && currentCounter < requiredCount){
                resultArr[currentCounter] = arr[i];
                currentCounter++;
            }
        }
        if (currentCounter == 0){
            return new int[0];
        }else if (currentCounter <= requiredCount-1){
            return Arrays.copyOf(resultArr, currentCounter);
        }
        return reverse(resultArr);
    }

    private static int[] reverse(int[] resultArr) {
        int temp;
        for (int d = 0; d < resultArr.length/2; d++) {
            temp = resultArr[d];
            resultArr[d] = resultArr[resultArr.length-d-1];
            resultArr[resultArr.length-d-1] = temp;
        }
        return resultArr;
    }

    private static int[] firstEvenOrOddElements(int[] arr, int requiredCount, int divisionResult) {
        int[] resultArr = new int[requiredCount];
        int currentCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == divisionResult && currentCounter<requiredCount){
                resultArr[currentCounter] = arr[i];
                currentCounter++;
            }
        }
        if (currentCounter == 0){
            return new int[0];
        }else if (currentCounter <= requiredCount-1){
            return Arrays.copyOf(resultArr, currentCounter);
        }
        return resultArr;
    }

    private static int minEvenOrOddIndex(int[] arr, int divisionResult) {
        int minNum = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= minNum && arr[i] % 2 == divisionResult){
                //set new max value = currentElement
                minNum = arr[i];
                //set maxNum index to current index
                index = i;
            }
        }
        return index;
    }

    private static int maxEvenOrOddIndex(int[] arr, int divisionResult) {
        int maxNum = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= maxNum && arr[i] % 2 == divisionResult){
                //set new max value = currentElement
                maxNum = arr[i];
                //set maxNum index to current index
                index = i;
            }
        }
        return index;
    }

    private static void exchange(int[] arr, int position) {
        for (int i = 0; i <= position; i++) {
            //save the first element of the array
            int firstNum = arr[0];

            for (int j = 0; j < arr.length-1; j++) {
                //shift all elements to the left
                arr[j] = arr[j+1];
            }
            //overwrite last position with first element
            arr[arr.length-1] = firstNum;
        }
    }
}

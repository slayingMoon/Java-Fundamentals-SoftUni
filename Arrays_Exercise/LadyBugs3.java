package Arrays_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LadyBugs3 {
    public static void main(String[] args) throws IOException {
        BufferedReader read =new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(read.readLine());
        int[] field = new int[size];
        int[] bugPositions = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).filter(e->e>=0&&e<size).toArray();

        for (int pos : bugPositions) {
            field[pos]=1;
        }

        String input;

        while (!"end".equals(input=read.readLine())){
            String[]details = input.split("\\s+");

            int bugIndex = Integer.parseInt(details[0]);
            String direction = details[1];
            int flyLength = Integer.parseInt(details[2]);

            if ((bugIndex>=0&&bugIndex<field.length)&&field[bugIndex]==1){
                field[bugIndex]=0;

                switch (direction){
                    case "right":
                        bugIndex+=flyLength;
                        if (bugIndex<field.length&&bugIndex>=0){
                            if (field[bugIndex]==1){
                                while (bugIndex<field.length&&field[bugIndex]==1){
                                    bugIndex+=flyLength;
                                }
                                if (bugIndex<field.length){
                                    field[bugIndex]=1;
                                }
                            }else {
                                field[bugIndex]=1;
                            }
                        }
                        break;
                    case "left":
                        bugIndex-=flyLength;
                        if (bugIndex<field.length&&bugIndex>=0){
                            if (field[bugIndex]==1){
                                while (field[bugIndex] == 1){
                                    bugIndex-=flyLength;
                                }
                                field[bugIndex]=1;
                            }else {
                                field[bugIndex]=1;
                            }
                        }
                        break;
                }
            }

        }
        for (int i : field) {
            System.out.print(i+" ");
        }
    }
}

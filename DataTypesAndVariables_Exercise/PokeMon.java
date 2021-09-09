package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int pokeCounter = 0;
        int halfPower = (pokePower*50)/100;

        while (pokePower >= distance){
            pokePower-=distance;
            pokeCounter++;
            if (pokePower == halfPower){
                if (distance>0) {
                    pokePower = pokePower / exhaustionFactor;
                }
            }
        }
        System.out.println(pokePower);
        System.out.println(pokeCounter);
    }
}

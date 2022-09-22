package DataTypeAndVariables.Exercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pokePowerN = Integer.parseInt(in.nextLine());
        int distanceM = Integer.parseInt(in.nextLine());
        int exhaustionFactorY = Integer.parseInt(in.nextLine());
        int startPokePower = pokePowerN;
        int countPokes = 0;


        while (pokePowerN >= distanceM) {

            pokePowerN -= distanceM;
            countPokes++;

            if (pokePowerN == startPokePower * 0.50) {
                if (exhaustionFactorY>0) {
                    pokePowerN = pokePowerN / exhaustionFactorY;
                }
            }
        }
        System.out.println(pokePowerN);
        System.out.println(countPokes);
    }
}

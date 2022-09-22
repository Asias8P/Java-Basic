package objectAndClasses.Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class bigFactoriel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        BigInteger factiriel = new BigInteger(String.valueOf(1));
        for (int i = 1; i <=n; i++) {
        factiriel=factiriel.multiply(BigInteger.valueOf(i));

        }
        System.out.println(factiriel);

    }
}

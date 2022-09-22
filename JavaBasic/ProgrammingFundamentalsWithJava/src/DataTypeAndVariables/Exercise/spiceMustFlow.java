package DataTypeAndVariables.Exercise;

import java.util.Scanner;

public class spiceMustFlow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startingYield = Integer.parseInt(in.nextLine());
        int spice =0;
        int counter = 0;
        int totalSpice=0;

        while (startingYield >= 100) {
            spice = startingYield;
            spice -= 26;
            startingYield -= 10;
            totalSpice+=spice;
            counter++;
        }

        if (totalSpice > 26) {
            totalSpice -= 26;
        }
        System.out.println(counter);
        System.out.println(totalSpice);
    }
}

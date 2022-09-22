package Lab_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= Integer.parseInt(in.nextLine());
        int product=0;
        for (int i = 1; i <=10 ; i++) {
            product=n*i;

            System.out.printf("%d X %d = %d%n",n,i,product);

        }
    }
}

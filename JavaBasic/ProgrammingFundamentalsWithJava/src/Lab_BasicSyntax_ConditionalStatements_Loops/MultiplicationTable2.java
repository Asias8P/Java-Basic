package Lab_BasicSyntax_ConditionalStatements_Loops;

import java.io.PrintStream;
import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= Integer.parseInt(in.nextLine());
        int times= Integer.parseInt(in.nextLine());

        if(times>10){
            System.out.printf("%d X %d = %d",n,times,times*n);

        }

        int product =0;

        for (int i = times; i <=10 ; i++) {


            product=n*i;
            System.out.printf("%d X %d = %d%n",n,i,product);

        }
    }
}

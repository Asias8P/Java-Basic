package Lab_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        while (n % 2 !=0){
            System.out.println("Please write an even number.");

            n=Integer.parseInt(in.nextLine());
        }

        System.out.printf("The number is: %d",Math.abs(n));
    }
}

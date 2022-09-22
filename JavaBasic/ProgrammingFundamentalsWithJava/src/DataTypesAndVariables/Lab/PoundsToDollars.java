package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gbp = Double.parseDouble(in.nextLine());
        double usd= gbp*1.36;
        System.out.printf("%.3f",usd);
    }
}

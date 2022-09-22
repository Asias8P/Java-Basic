package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class ConvertMetresToKM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int metres= Integer.parseInt(in.nextLine());

        double result = metres/1000.00;
        System.out.printf("%.2f",result);
    }
}

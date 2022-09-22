package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathPower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double aIn = Double.parseDouble(in.nextLine());
        int bIn = Integer.parseInt(in.nextLine());

        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(mathPowM(aIn,bIn)));

    }
    private static double mathPowM (double a, int b){
        double result = 1;
        for (int i = 1; i <=b ; i++) {
            result*=a;
        }
        return result;
    }
}

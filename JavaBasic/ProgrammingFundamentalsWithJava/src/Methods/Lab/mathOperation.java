package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathOperation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double firstNum = Double.parseDouble(in.nextLine());
        String operation=in.nextLine();
        double secondNum = Double.parseDouble(in.nextLine());

        System.out.println(new DecimalFormat("0.##").format(operation(firstNum,operation,secondNum)));
    }
    private static double operation(double a,String sign,double b){
        double result=0;
        switch (sign){
            case "+":
                 result= a+b;
                 break;
            case "-":
                result= a-b;
                break;
            case "*":
                result= a*b;
                break;
            case "/":
                result= a/b;
                break;
        }
        return result;
    }
}

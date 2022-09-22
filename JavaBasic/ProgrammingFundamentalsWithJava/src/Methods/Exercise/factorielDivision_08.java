package Methods.Exercise;

import java.util.Scanner;

public class factorielDivision_08 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        double firstNum=Double.parseDouble(in.nextLine());
        double secNum=Double.parseDouble(in.nextLine());
        factorielDevision(firstNum,secNum);
    }
    private static void factorielDevision(double number1,double number2){

        double factoriel1=1;
        double factoriel2=1;
        for (int i = 1; i <=number1 ; i++) {
            factoriel1*=i;
        }
        for (int i = 1; i <=number2 ; i++) {
            factoriel2*=i;
        }
        double result =factoriel1/factoriel2;
        System.out.printf("%.2f",result);
    }
}

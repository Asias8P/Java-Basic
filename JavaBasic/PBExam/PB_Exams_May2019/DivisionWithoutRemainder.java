package PB_Exams_May2019;

import java.util.Scanner;

public class DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        int divisibleBy2=0;
        int divisibleBy3=0;
        int divisibleBy4=0;

        for (int i = 1; i <=n ; i++) {
            int number = Integer.parseInt(in.nextLine());
            if(number % 2==0){
                divisibleBy2++;
            }
            if(number % 3==0){
                divisibleBy3++;
            }
            if(number % 4==0){
                divisibleBy4++;
            }

        }
         double percent2=divisibleBy2*1.00/n*100;
         double percent3=divisibleBy3*1.00/n*100;
         double percent4=divisibleBy4*1.00/n*100;
        System.out.printf("%.2f%%\n",percent2);
        System.out.printf("%.2f%%\n",percent3);
        System.out.printf("%.2f%%\n",percent4);
    }
}

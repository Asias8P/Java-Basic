package NestedLoops;

import java.util.Scanner;

public class EqualsSumsEvenOddPosition2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1=Integer.parseInt(in.nextLine());
        int n2=Integer.parseInt(in.nextLine());

        for (int i = n1; i <=n2 ; i++) {

            int sumOdd=0;
            int sumEven=0;
            int number=i;
            for (int j = 6; j >=1 ; j--) {
               int digit= number % 10;

                if(j % 2 ==0){
                    sumEven+=digit;
                }
                else {
                    sumOdd+=digit;
                }
               number=number/10;


            }
            if(sumEven==sumOdd){
                System.out.print(i+" ");}
        }

    }
}

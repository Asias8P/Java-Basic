package NestedLoops;

import java.util.Scanner;

public class EqualsSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int startNum=Integer.parseInt(in.nextLine());
        int endNum=Integer.parseInt(in.nextLine());


        for (int i = startNum; i <=endNum ; i++) {
            int sumOdd=0;
            int sumEven=0;
        String number = ""+i;
        for (int j = 0; j <=number.length()-1 ; j++) {
            int digit = Integer.parseInt(""+number.charAt(j));
            if(j % 2==0){
                sumEven+=digit;
            }
            else {
                sumOdd+=digit;
            }


        }
            if(sumEven==sumOdd){
                System.out.print(i+" ");}
    }
}}

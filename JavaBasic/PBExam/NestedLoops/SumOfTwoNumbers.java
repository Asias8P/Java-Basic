package NestedLoops;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startNum=Integer.parseInt(in.nextLine());
        int secondNum=Integer.parseInt(in.nextLine());
        int magicNum=Integer.parseInt(in.nextLine());
          boolean isMagicFound=false;
        int counter=0;
        int i=0;
        int j=0;


        for (i = startNum; i <=secondNum ; i++) {
            for ( j = startNum; j <=secondNum ; j++) {
                counter++;
                if(i+j==magicNum){
                    isMagicFound=true;
                    break;
                }

            }
if(isMagicFound){
    break;
}
        }
        if(isMagicFound){
        System.out.printf("Combination N:%d (%d + %d = %d)",counter,i,j,magicNum);}
        else {
            System.out.printf("%d combinations - neither equals %d",counter,magicNum);
        }

    }
}

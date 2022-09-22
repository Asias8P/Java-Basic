package Methods.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class topNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = Integer.parseInt(in.nextLine());
        printTopNum(number);
    }

    private static void printTopNum(int number){


        int currentNum=0;
        for (int i = 1; i <=number ; i++) {
            int sumOfDigits=0;
            boolean isDigitOdd=false;
            currentNum=i;
            while (currentNum>0){
            int digit = currentNum % 10;
            sumOfDigits+=digit;
            if(digit % 2!=0){
                isDigitOdd=true;
            }
            currentNum=currentNum/10;

        }
            if (sumOfDigits % 8==0 && isDigitOdd){
                System.out.println(i);
            }
        }

    }
}

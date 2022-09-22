package Methods.Lab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class multiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());

        System.out.println(productEvenOdd(num));

    }

    private static int sumEven(int number) {
        int sumEven = 0;
        if(number<0){
            number=Math.abs(number);
        }
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                sumEven += lastDigit;
            }
            number = number / 10;
        }
        return sumEven;
    }

    private static int sumOdd(int number) {
        int sumOdd = 0;
        if(number<0){
            number=Math.abs(number);
        }
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                sumOdd += lastDigit;
            }
            number = number / 10;
        }
        return sumOdd;
    }

    private static int productEvenOdd(int n){
        int sumEv=sumEven(n);
        int sumOdd=sumOdd(n);

        return sumEv*sumOdd;
    }
}

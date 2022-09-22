package DataTypeAndVariables.Exercise;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = Integer.parseInt(in.nextLine());
        int sum =0;
        while (number>0){
          int lastDigit = number % 10;
            sum+=lastDigit;
            number=number/10;

        }
        System.out.println(sum);
    }
}

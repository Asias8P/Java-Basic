package Methods.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class palindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number= in.nextLine();


        while (!number.equals("END")) {
            System.out.println(palindrome(number));

            number= in.nextLine();

        }
    }
    private static boolean palindrome(String num) {
        String [] number=num.split("");
        String [] reversed= num.split("");
        for (int i =0; i <reversed.length/2 ; i++) {
            String temp = reversed[i];
            reversed[i]=reversed[reversed.length-1-i];
            reversed[reversed.length-1-i]=temp;
        }
        return Arrays.equals(reversed, number);
    }


}

package textProcessing.Lab.Exercise;

import java.util.Scanner;

public class MultiplyBigNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstNum= in.nextLine();
        int secNum= Integer.parseInt(in.nextLine());
StringBuilder bd = new StringBuilder();
        for (int i= firstNum.length()-1; i>=0; i--){
            char num=firstNum.charAt(i);
            String numStr = ""+num;
            int number = Integer.parseInt(numStr);
            int result = number*secNum;
            bd.append(result);
        }
        bd=bd.reverse();
        System.out.println(bd);


//        BigInteger number1 = new BigInteger(in.nextLine());
//        BigInteger number2 = new BigInteger(in.nextLine());
//
//
//        System.out.println(number1.multiply(number2));
    }
}

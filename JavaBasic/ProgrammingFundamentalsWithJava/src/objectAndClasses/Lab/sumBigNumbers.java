package objectAndClasses.Lab;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class sumBigNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger num1 = new BigInteger(in.nextLine());
        BigInteger num2 = new BigInteger(in.nextLine());
        BigInteger sum = num1.add(num2);
        System.out.println(sum);
    }
}

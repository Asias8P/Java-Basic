package com.telerikacademy.formating;

import java.util.Scanner;

public class PrintfFloatingPointNumbersDemo {
    public static void main(String[] args) {
        double pi = Math.PI;

        // %f - floating-point number
        System.out.format("%f%n", pi);
        // %f - floating-point number - 3 digits after the point
        System.out.format("%.3f%n", pi);

//
//        Scanner number = new Scanner(System.in);
//        int number1 = Integer.parseInt(number.nextLine());
//        System.out.printf("%d*%d = ", number1, number1);
//        System.out.print(number1*number1);

    }
}

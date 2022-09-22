package MoreExercises_BasicSyntax_ConStatements_Loops;

import java.util.Scanner;

public class SortNumbers_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = Integer.parseInt(in.nextLine());
        int num2 = Integer.parseInt(in.nextLine());
        int num3 = Integer.parseInt(in.nextLine());
        int temp = 0;

        if (num1 > num2) {
            if (num1 > num3) {
                if (num2 > num3) {
                    System.out.println(num1);
                    System.out.println(num2);
                    System.out.println(num3);
                } else {
                    System.out.println(num1);
                    System.out.println(num3);
                    System.out.println(num2);
                }

            }

        }  if (num2 > num1) {
            if (num2 > num3) {
                if (num1 > num3) {
                    System.out.println(num2);
                    System.out.println(num1);
                    System.out.println(num3);
                } else {
                    System.out.println(num2);
                    System.out.println(num3);
                    System.out.println(num1);
                }
            }
        }

         if (num3 > num1) {
            if (num3 > num2) {
                if (num1 > num2) {

                    System.out.println(num3);
                    System.out.println(num1);
                    System.out.println(num2);
                } else {
                    System.out.println(num3);
                    System.out.println(num2);
                    System.out.println(num1);
                }
            }
        }
    }
}



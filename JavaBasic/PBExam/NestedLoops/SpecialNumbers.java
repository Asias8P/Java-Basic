package NestedLoops;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        for (int i = 1; i <9 ; i++) {
            if (N % i == 0) {
                for (int j = 1; j <= 9; j++) {
                    if (N % j == 0) {
                        for (int k = 1; k <= 9; k++) {
                            if (N % k == 0) {
                                for (int l = 1; l <= 9; l++) {
                                    if (N % l == 0) {
                                        System.out.printf("%d%d%d%d ",i,j,k,l);
                                    }

                                }

                            }

                        }

                    }
                }
            }
        }}}
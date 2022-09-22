package com.telerikacademy;

import java.util.Scanner;

public class CheckSymmetry {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Number of elements = ");
        int size = Integer.parseInt(scn.nextLine());

        // Declaring the array
        int[] array = new int[size];

        // Filing the array
        for (int i = 0; i < size; i++) {
            System.out.printf("arr[%d] = ", i);
            array[i] = Integer.parseInt(scn.nextLine());
        }

        boolean isSymmetric = true;
        // Compare elements from both sides of the array
        // first element: i = 0; last element: size - i - 1 = size - 1
        // first element: i = 1; last element: size - i - 1 = size - 2
        // ect.
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[size - i - 1]) {
                isSymmetric = false;
                break;
            }
        }

        System.out.printf("Symmetric? --> %s", isSymmetric);
    }
}

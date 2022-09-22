package com.telerikacademy;

import java.util.Scanner;

public class FindMaxWithForeach {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter count of numbers: ");
        int count = Integer.parseInt(scn.nextLine());

        // Read Array
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            // For readability start numbers from 1
            // Still, the array's index ALWAYS starts from 0
            System.out.printf("Enter number %d: ", i + 1);
            int nextNumber = Integer.parseInt(scn.nextLine());
            numbers[i] = nextNumber;
        }

        // Find Max
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.printf("Max: %d", max);
    }
}

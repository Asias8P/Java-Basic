package com.telerikacademy;

import java.util.Scanner;

public class PrintFormattedSum {

    public static void main(String[] args) {
        // Read Array
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter numbers on a single line, separated by a space:");
        String[] numbersAsStrings = scn.nextLine().split(" ");

        // Find Sum
        int sum = 0;
        for (int i = 0; i < numbersAsStrings.length; i++) {
            int number = Integer.parseInt(numbersAsStrings[i]);
            sum += number;
        }

        // Print Formatted Array
        String formattedArray = String.join(" + ", numbersAsStrings);
        System.out.printf("%s = %d", formattedArray, sum);
    }
}

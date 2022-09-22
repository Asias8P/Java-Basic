package com.telerikacademy.formating;

public class PrintfRegularDemo {
    public static void main(String[] args) {
        String name = "John Doe";
        int age = 20;

        // Print on the console declared variables
        // Use %d for decimal numbers
        // Use %s for a String
        System.out.printf(
                "Hi! My name is %s and I am %d years old",
                name,
                age);
    }
}

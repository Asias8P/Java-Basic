package NestedLoops;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sumPrime = 0;
        int sumNonPrime = 0;
        String command = in.nextLine();

        while (!command.equals("stop")) {
            boolean isPrime = true;
            int number = Integer.parseInt(command);
            if (number < 0) {
                System.out.println("Number is negative.");
                command = in.nextLine();
                continue;
            }
            for (int i = 2; i <= number - 1; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    sumNonPrime += number;
                    break;
                }

            }
            if(isPrime) {
                sumPrime += number;
            }
            command = in.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %s%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %s%n", sumNonPrime);
    }
}

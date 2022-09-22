package PB_Exam_July_2019;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double budget = Double.parseDouble(in.nextLine());
        int numberNights = Integer.parseInt(in.nextLine());
        double priceForNight = Double.parseDouble(in.nextLine());
        int additionalCosts = Integer.parseInt(in.nextLine());

        double totalPriceForAllNights = 0;

        if (numberNights > 7) {
            priceForNight -= priceForNight * 5 / 100;
            totalPriceForAllNights = numberNights * priceForNight;
        } else {
            totalPriceForAllNights = numberNights * priceForNight;
        }
        double totalAddCosts = budget * additionalCosts / 100;

        double total = totalPriceForAllNights + totalAddCosts;

        if (total <= budget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.%n", budget - total);
        } else {
            System.out.printf("%.2f leva needed.", total - budget);
        }
    }
}

package PBJune_2019;

import java.util.Scanner;

public class MovieStars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double budget = Double.parseDouble(in.nextLine());

        double salary = 0;
        boolean isBudgetOver = false;
        String action = in.nextLine();
        while (!action.equals("ACTION")) {
            if (action.length() > 15) {
                budget -= (budget * 20 / 100);
                action= in.nextLine();
                continue;
            }
            salary = Double.parseDouble(in.nextLine());
            budget -= salary;
            if (budget < 0) {
                isBudgetOver = true;
                break;
            }


            action = in.nextLine();
        }

        if (isBudgetOver) {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
        } else {
            System.out.printf("We are left with %.2f leva.", budget);
        }

    }
}

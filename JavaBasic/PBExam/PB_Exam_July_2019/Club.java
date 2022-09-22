package PB_Exam_July_2019;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double wantedIncome = Double.parseDouble(in.nextLine());
        boolean target = false;
        double price = 0;
        double price1=0;
        String coctailName = in.nextLine();


        while (!coctailName.equals("Party!")) {
            int numberOfCoctails = Integer.parseInt(in.nextLine());
           price1=numberOfCoctails*coctailName.length();
            if (price1 % 2 != 0) {
                price1 -= price1 * 25 / 100;
            }
            price += price1;

            if (price >= wantedIncome) {
                target = true;
                break;
            }


            coctailName = in.nextLine();

        }


        if (target) {
            System.out.println("Target acquired.");
        }
        else {
            System.out.printf("We need %.2f leva more.%n",wantedIncome-price);
        }

        System.out.printf("Club income - %.2f leva.", price);

    }
}

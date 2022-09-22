package PBMarch_019;

import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String country = in.nextLine();
        String object = in.nextLine();
        double difficulty = 0;
        double performance = 0;
        double total = 0;


        switch (country) {

            case "Russia":
                if (object.equals("ribbon")) {
                    difficulty = 9.1;
                    performance = 9.4;


                } else if (object.equals("hoop")) {
                    difficulty = 9.3;
                    performance = 9.8;

                } else if (object.equals("rope")) {
                    difficulty = 9.6;
                    performance = 9.0;
                }
                break;
            case "Bulgaria":
                if (object.equals("ribbon")) {
                    difficulty = 9.6;
                    performance = 9.4;

                } else if (object.equals("hoop")) {
                    difficulty = 9.55;
                    performance = 9.75;

                } else if (object.equals("rope")) {
                    difficulty = 9.5;
                    performance = 9.4;
                }
                break;

            case "Italy":
                if (object.equals("ribbon")) {
                    difficulty = 9.2;
                    performance = 9.5;

                } else if (object.equals("hoop")) {
                    difficulty = 9.45;
                    performance = 9.35;

                } else if (object.equals("rope")) {
                    difficulty = 9.7;
                    performance = 9.15;
                }
                break;
            default:
                System.out.println();
        }
        total=difficulty+performance;
        double percentto100= 100-(total/20*100);
        System.out.printf("The team of %s get %.3f on %s.%n",country,total,object);
        System.out.printf("%.2f%%",percentto100);

    }
}

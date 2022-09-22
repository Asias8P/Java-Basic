package PBJune_2019;

import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String movieName = in.nextLine();
        int days=Integer.parseInt(in.nextLine());
        int tickets=Integer.parseInt(in.nextLine());
        double pricetickets=Double.parseDouble(in.nextLine());
        int percentForTheMovie =Integer.parseInt(in.nextLine());
        double totalProfit = days*(tickets*pricetickets);
        double forTheCinema = totalProfit*percentForTheMovie*1.00/100;
        double total = totalProfit-forTheCinema;

        System.out.printf("The profit from the movie %s is %.2f lv.",movieName,total);
    }
}

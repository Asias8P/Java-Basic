package PBJune_2019;

import java.util.Scanner;

public class MovieDestination {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double budget = Double.parseDouble(in.nextLine());
        String destination = in.nextLine();
        String season = in.nextLine();
        int numOfDays = Integer.parseInt(in.nextLine());
        double price = 0;

        switch (destination) {
            case "Dubai":
                if(season.equals("Winter")){
                    price=numOfDays*45000;
                }
                else {
                    price=numOfDays*40000;
                }
                price=price-(price*30/100);
                break;
            case "Sofia":

                if(season.equals("Winter")){
                    price=numOfDays*17000;
                }
                else {
                    price=numOfDays*12500;
                }
                price=price+(price*25/100);
                break;
            case "London":
                if(season.equals("Winter")){
                    price=numOfDays*24000;
                }
                else {
                    price=numOfDays*20250;
                }
                break;
        }
        if(budget>=price){
        System.out.printf("The budget for the movie is enough! We have %.2f leva left!",budget-price);}
        else {
            System.out.printf("The director needs %.2f leva more!",price-budget);
        }
    }
}

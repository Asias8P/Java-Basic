package PBJune_2019;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double budget = Double.parseDouble(in.nextLine());
        int numSerials= Integer.parseInt(in.nextLine());
        double totalPrice=0;
        for (int i = 1; i <=numSerials ; i++) {
            String serialName= in.nextLine();
            double priceSerial=Double.parseDouble(in.nextLine());
            switch (serialName){
                case "Thrones":
                    priceSerial-=priceSerial*50/100;
                    totalPrice+=priceSerial;
                    break;
                case "Lucifer":
                    priceSerial-=priceSerial*40/100;
                    totalPrice+=priceSerial;
                    break;
                case "Protector":
                    priceSerial-=priceSerial*30/100;
                    totalPrice+=priceSerial;
                    break;
                case "TotalDrama":
                    priceSerial-=priceSerial*20/100;
                    totalPrice+=priceSerial;
                    break;
                case "Area":
                    priceSerial-=priceSerial*10/100;
                    totalPrice+=priceSerial;
                    break;
                default:
                    totalPrice+=priceSerial;
            }



        }
        if(budget>=totalPrice){
            System.out.printf("You bought all the series and left with %.2f lv.",budget-totalPrice);
        }
        else {
            System.out.printf("You need %.2f lv. more to buy the series!",totalPrice-budget);
        }
    }
}

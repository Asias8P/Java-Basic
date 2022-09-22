package PB_Exam_July_2019;

import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String town = in.nextLine();
        String pack = in.nextLine();
        String VIP = in.nextLine();
        int numDays = Integer.parseInt(in.nextLine());
        double price = 0;
        boolean isInvalidInput=false;
        if(numDays<1)  {
            isInvalidInput=true;
            System.out.println("Days must be positive number!");
        }
        if (!(pack.equals("noEquipment")) && !(pack.equals("withEquipment")) && !(pack.equals("withBreakfast")) && !(pack.equals("noBreakfast"))){
            isInvalidInput=true;
            System.out.println("Invalid input!");

        }

        switch (town) {
            case "Bansko":
            case "Borovets":
                if (pack.equals("noEquipment")) {
                    if(numDays>7){
                        price=(numDays-1)*80;
                    }
                    else {
                    price = numDays * 80;}

                    if (VIP.equals("yes")) {
                        price -= price * 5 / 100;
                    }

                } else if(pack.equals("withEquipment")) {
                    if(numDays>7){
                        price=(numDays-1)*100;
                    }
                    else {
                        price = numDays * 100;}

                    if (VIP.equals("yes")) {
                        price -= price * 10 / 100;
                    }
                }

                break;
            case "Varna":
            case "Burgas":
                if (pack.equals("noBreakfast")) {
                    if(numDays>7){
                        price=(numDays-1)*100;
                    }
                    else {
                        price = numDays * 100;}

                    if (VIP.equals("yes")) {
                        price -= price * 7 / 100;
                    }
                } else if(pack.equals("withBreakfast")){
                    if(numDays>7){
                        price=(numDays-1)*130;
                    }
                    else {
                        price = numDays * 130;}
                    if (VIP.equals("yes")) {
                        price -= price * 12 / 100;
                    }
                }

                break;
            default:
                System.out.println("Invalid input!");
                isInvalidInput=true;
                break;

        }
       if(!isInvalidInput){
        System.out.printf("The price is %.2flv! Have a nice time!",price);}
    }
}

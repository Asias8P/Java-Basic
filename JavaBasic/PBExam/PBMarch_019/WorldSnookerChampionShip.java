package PBMarch_019;

import java.util.Scanner;

public class WorldSnookerChampionShip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String level= in.nextLine();
        String ticketType= in.nextLine();
        int numberOfTickets= Integer.parseInt(in.nextLine());
        String picture= in.nextLine();
        double price=0;

        switch (level){
            case "Quarter final":
                if(ticketType.equals("Standard")){
                    price=numberOfTickets*55.50;
                }
                else  if(ticketType.equals("Premium")){
                    price=numberOfTickets*105.20;
                }
                else  if(ticketType.equals("VIP")){
                    price=numberOfTickets*118.90;
                }
                break;
            case "Semi final":
                if(ticketType.equals("Standard")){
                    price=numberOfTickets*75.88;
                }
                else  if(ticketType.equals("Premium")){
                    price=numberOfTickets*125.22;
                }
                else  if(ticketType.equals("VIP")){
                    price=numberOfTickets*300.40;
                }
                break;
            case "Final":
                if(ticketType.equals("Standard")){
                    price=numberOfTickets*110.10;
                }
                else  if(ticketType.equals("Premium")){
                    price=numberOfTickets*160.66;
                }
                else  if(ticketType.equals("VIP")){
                    price=numberOfTickets*400;
                }
                break;
        }

        if(price>2500 && price<=4000){
            price=price-(price*10/100);}
       else if(price>4000){
            price=price-(price*25/100);
        if(picture.equals("Y")){
            price=price-(numberOfTickets*40);
        }}

        if(picture.equals("Y")){
            price=price+(numberOfTickets*40);
        }

        System.out.printf("%.2f",price);

    }
}

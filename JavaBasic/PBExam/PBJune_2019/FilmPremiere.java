package PBJune_2019;

import java.util.Scanner;

public class FilmPremiere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String movie = in.nextLine();
        String pack = in.nextLine();
        int numTickets = Integer.parseInt(in.nextLine());
       double price =0;
        switch (movie) {
            case "John Wick":
                if(pack.equals("Drink")){
                    price=numTickets*12;
                }
                else if(pack.equals("Popcorn")){
                    price=numTickets*15;
                }
                else {
                    price=numTickets*19;
                }
                break;
            case "Star Wars":
                if(pack.equals("Drink")){
                    price=numTickets*18;
                }
                else if(pack.equals("Popcorn")){
                    price=numTickets*25;
                }
                else {
                    price=numTickets*30;
                }

                if(numTickets>=4){
                    price=price-(price*30/100);
                }
                break;
            case "Jumanji":
                if(pack.equals("Drink")){
                    price=numTickets*9;
                }
                else if(pack.equals("Popcorn")){
                    price=numTickets*11;
                }
                else {
                    price=numTickets*14;
                }

                if(numTickets==2){
                    price=price-(price*15/100);
                }
                break;
        }

        System.out.printf("Your bill is %.2f leva.",price);
    }
}

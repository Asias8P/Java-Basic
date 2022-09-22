package PB_Exam_April_2019;

import java.util.Scanner;

public class OscarsWeekInCInema {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String movieName = in.nextLine();
        String hallType = in.nextLine();
        int ticketNums = Integer.parseInt(in.nextLine());
        double ticketPrice=0;

        switch (movieName) {
            case "A Star Is Born":
                if(hallType.equals("normal")){
                    ticketPrice=ticketNums*7.50;
                }
                else if(hallType.equals("luxury")){
                    ticketPrice=ticketNums*10.50;
                }
                else if(hallType.equals("ultra luxury")){
                    ticketPrice=ticketNums*13.50;
                }
                break;
            case "Bohemian Rhapsody":
                if(hallType.equals("normal")){
                    ticketPrice=ticketNums*7.35;
                }
                else if(hallType.equals("luxury")){
                    ticketPrice=ticketNums*9.45;
                }
                else if(hallType.equals("ultra luxury")){
                    ticketPrice=ticketNums*12.75;
                }
                break;
            case "Green Book":

                if(hallType.equals("normal")){
                    ticketPrice=ticketNums*8.15;
                }
                else if(hallType.equals("luxury")){
                    ticketPrice=ticketNums*10.25;
                }
                else if(hallType.equals("ultra luxury")){
                    ticketPrice=ticketNums*13.25;
                }
                break;
            case "The Favourite":

                if(hallType.equals("normal")){
                    ticketPrice=ticketNums*8.75;
                }
                else if(hallType.equals("luxury")){
                    ticketPrice=ticketNums*11.55;
                }
                else if(hallType.equals("ultra luxury")){
                    ticketPrice=ticketNums*13.95;
                }
                break;
        }

        System.out.printf("%s -> %.2f lv.",movieName,ticketPrice);
    }
}

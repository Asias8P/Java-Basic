package NestedLoops;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String movieName = in.nextLine();
        int studectTickets = 0;
        int standardTickets = 0;
        int kidsTickets = 0;
        int totalSoldTickets=0;
        int counterStudents=0;
        int counterStandard=0;
        int counterKid=0;


        while (!movieName.equals("Finish")) {
            int freeSeats = Integer.parseInt(in.nextLine());
            studectTickets=0;
            standardTickets=0;
            kidsTickets=0;
            String ticketType = in.nextLine();
            while (!ticketType.equals("End")) {

                if (ticketType.equals("student")) {
                    studectTickets++;
                    counterStudents++;
                } else if (ticketType.equals("standard")) {
                    standardTickets++;
                    counterStandard++;
                } else {
                    kidsTickets++;
                    counterKid++;
                }
                if(standardTickets+studectTickets+kidsTickets>=freeSeats){
                    break;
                }
                ticketType = in.nextLine();

            }

            totalSoldTickets+= standardTickets + studectTickets + kidsTickets;
            double percentFull = (standardTickets + studectTickets + kidsTickets) * 1.00 / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", movieName,percentFull);
            movieName = in.nextLine();
        }

        System.out.printf("Total tickets: %d%n",totalSoldTickets);
        System.out.printf("%.2f%% student tickets.%n",counterStudents*1.00/totalSoldTickets*100);
        System.out.printf("%.2f%% standard tickets.%n",counterStandard*1.00/totalSoldTickets*100);
        System.out.printf("%.2f%% kids tickets.%n",counterKid*1.00/totalSoldTickets*100);
    }
}

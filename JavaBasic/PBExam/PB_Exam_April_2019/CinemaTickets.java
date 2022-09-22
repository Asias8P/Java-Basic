package PB_Exam_April_2019;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String movieName = in.nextLine();


        int counterStudent = 0;
        int counterStandard = 0;
        int counterKid = 0;

        int counterAllMovies = 0;


        while (!movieName.equals("Finish")) {
            int freeSeats = Integer.parseInt(in.nextLine());
            double percentFull = 0;
            int totalCounter = 0;
            String ticketType = in.nextLine();
            while (!ticketType.equals("End")) {

                switch (ticketType) {
                    case "student":
                        counterStudent++;
                        break;
                    case "standard":
                        counterStandard++;
                        break;
                    case "kid":
                        counterKid++;
                        break;
                }
                counterAllMovies++;
                totalCounter++;
                if (totalCounter == freeSeats) {
                    break;
                }
                ticketType = in.nextLine();

            }

            percentFull = totalCounter * 1.00 / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", movieName, percentFull);

            movieName = in.nextLine();
        }
        double percentStudents = counterStudent*1.00 / counterAllMovies * 100;
        double percentStandards = counterStandard*1.00 / counterAllMovies * 100;
        double percentKids = counterKid * 1.00 / counterAllMovies * 100;
        System.out.printf("Total tickets: %d%n", counterAllMovies);
        System.out.printf("%.2f%% student tickets.%n", percentStudents);
        System.out.printf("%.2f%% standard tickets.%n", percentStandards);
        System.out.printf("%.2f%% kids tickets.", percentKids);

    }
}

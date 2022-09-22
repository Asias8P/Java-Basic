package PBJune_2019;

import java.util.Scanner;

public class FavoutiteMovie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String movie = in.nextLine();
        int counter = 1;
        int points = 0;
        int bestResult = 0;
        boolean isLimitReached = false;
        String favouriteMovie = "";

        while (!movie.equals("STOP")) {
           points=0;
            for (int i = 0; i < movie.length(); i++) {
                char movieAschar = movie.charAt(i);

                if (movieAschar>=65&&movieAschar <= 90 ) {
                    points += movieAschar - movie.length();
                } else if (movieAschar >= 97 && movieAschar<=122) {
                    points+= movieAschar - (2 * movie.length());
                }
               else {
                    points+=movieAschar;
                }


            }
            if (points > bestResult) {
                bestResult = points;
                favouriteMovie = movie;
            }

            movie = in.nextLine();
            if(!movie.equals("STOP")){
            counter++;
            if (counter >= 7) {
                isLimitReached = true;
                break;
            }}
        }

        if (isLimitReached) {
            System.out.println("The limit is reached.");}

            System.out.printf("The best movie for you is %s with %d ASCII sum.", favouriteMovie, bestResult);

    }
}

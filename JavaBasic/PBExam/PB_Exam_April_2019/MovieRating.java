package PB_Exam_April_2019;

import java.util.Scanner;

public class MovieRating {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfMovies = Integer.parseInt(in.nextLine());
        double maxRating = Double.MIN_VALUE;
        double minRating = Double.MAX_VALUE;
        String maxRatingMovie="";
        String minRatingMovie="";
        double sum=0;

        for (int i = 1; i <=numOfMovies ; i++) {
            String movieName= in.nextLine();
            double movieRating = Double.parseDouble(in.nextLine());
            if(movieRating>maxRating){
                maxRating=movieRating;
                maxRatingMovie=movieName;
            }
            if(movieRating<minRating){
                minRating=movieRating;
                minRatingMovie=movieName;
            }
            sum+=movieRating;

        }

        System.out.printf("%s is with highest rating: %.1f%n",maxRatingMovie,maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n",minRatingMovie,minRating);
        System.out.printf( "Average rating: %.1f",sum/numOfMovies);
    }
}

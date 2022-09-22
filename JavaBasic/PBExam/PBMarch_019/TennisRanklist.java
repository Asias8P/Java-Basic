package PBMarch_019;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTournaments= Integer.parseInt(in.nextLine());
        int startPoints= Integer.parseInt(in.nextLine());
        int points=0;
        int counterW=0;
        for (int i = 1; i <=numberOfTournaments ; i++) {
            String tournamentLevel= in.nextLine();
            if(tournamentLevel.equals("W")){
                points+=2000;
                counterW++;
            }
          else if(tournamentLevel.equals("F")){
                points+=1200;
            }
            else {
                points+=720;
            }

        }
        double persentWins = counterW*1.00/numberOfTournaments*100;
        double avgPoins= Math.floor(points*1.00/numberOfTournaments);
        System.out.printf("Final points: %d%n",points+startPoints);
        System.out.printf("Average points: %.0f%n",avgPoins);
        System.out.printf("%.2f%%",persentWins);
    }
}

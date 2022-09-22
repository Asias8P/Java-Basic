package PB_Exam_July_2019;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String teamName = in.nextLine();
        int numOfPlayedGames = Integer.parseInt(in.nextLine());
        boolean noMathes=false;
        int points = 0;
        int counterW=0;
        int counterD=0;
        int counterL=0;
if(numOfPlayedGames<=0){
    noMathes=true;
}
     //   String result = in.nextLine();

        for (int i = 1; i <= numOfPlayedGames; i++) {
          String result = in.nextLine();
            if (result.equals("W")) {
                points += 3;
                counterW++;
            }
            else if (result.equals("D")) {
                points += 1;
                counterD++;
            }
            else {
                points+=0;
                counterL++;
            }


        }

        if(!noMathes) {
            System.out.printf( "%s has won %d points during this season.%n",teamName,points);
            System.out.println( "Total stats:");
            System.out.printf( "## W: %d%n",counterW);
            System.out.printf( "## D: %d%n",counterD);
            System.out.printf( "## L: %d%n",counterL);
            System.out.printf( "Win rate: %.2f%%",counterW*1.00/numOfPlayedGames*100);
        }
        else {
            System.out.printf("%s hasn't played any games during this season.",teamName);
        }

    }
}

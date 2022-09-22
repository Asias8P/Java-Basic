package PB_Exam_July_2019;

import java.util.Scanner;

public class GameShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberSoldGames = Integer.parseInt(in.nextLine());
        String game = "";
        int counterHearthstone=0;
        int counterFornite=0;
        int counterOverwatch=0;
        int counterOthers=0;

        for (int i = 1; i <= numberSoldGames; i++) {

            game = in.nextLine();

            if(game.equals("Hearthstone")){
                counterHearthstone++;
            }
            else if (game.equals("Fornite")){
                counterFornite++;
            }
          else if(game.equals("Overwatch")){
                counterOverwatch++;
            }
           else {
                counterOthers++;
            }

        }
        double percentHeartStone = counterHearthstone*1.00/numberSoldGames*100;
        double percentFornite = counterFornite*1.00/numberSoldGames*100;
        double percenOverwqtch = counterOverwatch*1.00/numberSoldGames*100;
        double percentOthers = counterOthers*1.00/numberSoldGames*100;
        System.out.printf("Hearthstone - %.2f%%%n",percentHeartStone);
        System.out.printf("Fornite - %.2f%%%n",percentFornite);
        System.out.printf("Overwatch - %.2f%%%n",percenOverwqtch);
        System.out.printf("Others - %.2f%%%n",percentOthers);
    }
}

package PBMarch_019;

import java.util.Scanner;

public class HighJump3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int wantedHigh=Integer.parseInt(in.nextLine());
        int counterFail=0;
        int counterJumps=0;
        boolean isFail=false;

        int startPosition=wantedHigh-30;
        while (wantedHigh>=startPosition){
            int jump = Integer.parseInt(in.nextLine());
            counterJumps++;
            if(jump>startPosition){
                startPosition+=5;
                counterFail=0;
            }
            else {
                counterFail++;
                if(counterFail==3){
                    isFail=true;
                    break;
                }
            }


        }

        if(isFail){
            System.out.printf("Tihomir failed at %dcm after %d jumps.%n",startPosition,counterJumps);
        }
        else {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.",wantedHigh,counterJumps);
        }
    }
}



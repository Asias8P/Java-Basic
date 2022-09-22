package PBMarch_019;

import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int wantedHigh = Integer.parseInt(in.nextLine());
        int position = wantedHigh - 30;
        int counterTries = 0;
        int counterJumps = 0;
        boolean isFail = false;
        while (position <= wantedHigh) {

            int jump = Integer.parseInt(in.nextLine());

            for (int i = 1; i <= 3; i++) {
                counterJumps++;
                if (jump > position) {
                    position += 5;
                    break;
                }

                if (i == 3) {
                    isFail = true;
                    break;
                }
                jump=Integer.parseInt(in.nextLine());
            }
            if(isFail){
                break;
            }}

            if (isFail) {
                System.out.printf("Tihomir failed at %dcm after %d jumps.%n", position, counterJumps);
            } else {
                System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", wantedHigh, counterJumps);
            }


        }
    }


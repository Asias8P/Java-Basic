package PBMarch_019;

import java.util.Scanner;

public class HighJump4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int slatHeight = Integer.parseInt(scanner.nextLine());
        double openingHeight = slatHeight - 30;
        double lath = openingHeight;
        double countJump = 0;
        double countUnsuccessful = 0;
        double lastJump = 0;
        while ( lath <= slatHeight ) {
            double jump = Double.parseDouble(scanner.nextLine());
            countJump++;
            lastJump = jump;
            if (jump > openingHeight){
                openingHeight += 5;
                lath += + 5;
                countUnsuccessful = 0;
            }else {
                countUnsuccessful++;
            }
            if (countUnsuccessful == 3){
                break;
            }
        }
        if (countUnsuccessful < 3){
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %.0f jumps.", slatHeight, countJump);
        }else {
            System.out.printf("Tihomir failed at %.0fcm after %.0f jumps.", openingHeight, countJump);
        }
    }
}




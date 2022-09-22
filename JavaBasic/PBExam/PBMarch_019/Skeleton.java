package PBMarch_019;

import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min=Integer.parseInt(in.nextLine());
        int secs=Integer.parseInt(in.nextLine());
        double length=Double.parseDouble(in.nextLine());
        int secsFor100m=Integer.parseInt(in.nextLine());
        double secFor1M=secsFor100m*1.00/100;

        double minInSec=min*60+secs;

        double delay= (length/120)*2.5;
        double totalTimeInSec=(length/100*secsFor100m)-delay;


        double secNeeded=totalTimeInSec-minInSec;
        if(totalTimeInSec<=minInSec){
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.",totalTimeInSec);
        }
        else {
            System.out.printf("No, Marin failed! He was %.3f second slower.",secNeeded);

        }
    }
}

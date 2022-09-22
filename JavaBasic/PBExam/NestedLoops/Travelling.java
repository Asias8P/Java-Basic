package NestedLoops;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String destination = in.nextLine();

        double totalSaved=0;

        while (!destination.equals("End")){
            double budget= Double.parseDouble(in.nextLine());
            totalSaved=0;
            while (totalSaved<budget){
           double savedMoney = Double.parseDouble(in.nextLine());
           totalSaved+=savedMoney;
          }
            System.out.printf("Going to %s!%n",destination);
           destination= in.nextLine();
        }

    }
}

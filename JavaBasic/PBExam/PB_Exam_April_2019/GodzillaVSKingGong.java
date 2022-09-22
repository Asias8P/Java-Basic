package PB_Exam_April_2019;

import java.util.Scanner;

public class GodzillaVSKingGong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double budget = Double.parseDouble(in.nextLine());
        int statistsNum= Integer.parseInt(in.nextLine());
        double priceClothers1=Double.parseDouble(in.nextLine());
       double priceClothesTotal=statistsNum*priceClothers1;
        double decor = budget*10/100;
         if(statistsNum>150){
             priceClothesTotal-= priceClothesTotal*10/100;
         }
         double totalCost = priceClothesTotal+decor;
         double diff=Math.abs(totalCost-budget);

         if(totalCost>budget){
             System.out.println("Not enough money!");
             System.out.printf("Wingard needs %.2f leva more.",diff);
         }
         else {
             System.out.println("Action!");
             System.out.printf("Wingard starts filming with %.2f leva left.",diff);
         }
    }
}

package PB_Exams_May2019;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double budget = Double.parseDouble(in.nextLine());
        double fuel = Double.parseDouble(in.nextLine());
        String dayOfWeekend= in.nextLine();
        int guidePrice=100;

        double priceFuel=fuel*2.10;
        double total= priceFuel+guidePrice;
        if(dayOfWeekend.equals("Sunday")){
            total-=total*20/100;
        }
        else {

                total-=total*10/100;
            }
double left=Math.abs(budget-total);
        if(budget>=total){
            System.out.printf("Safari time! Money left: %.2f lv.",left);
        }
        else {
            System.out.printf("Not enough money! Money needed: %.2f lv.",left);
        }
        }


    }


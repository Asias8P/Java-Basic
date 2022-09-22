package PB_Exams_May2019;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double budget = Double.parseDouble(in.nextLine());
        int numberProcucts=0;
        double totalPricePaid=0;
        boolean isBudgetOver=false;
        double price=0;
        int counter=0;
        String commandorProduct = in.nextLine();
        while (!commandorProduct.equals("Stop")){
            counter++;
            price = Double.parseDouble(in.nextLine());
            if(counter % 3==0){
                price=price/2;
            }
            budget=budget-price;
            if(budget<0){
                isBudgetOver=true;
                break;
            }
            numberProcucts++;
            totalPricePaid+=price;

            commandorProduct= in.nextLine();
        }
        if(isBudgetOver){
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!",Math.abs(budget));
        }
        else {
            System.out.printf("You bought %d products for %.2f leva.",numberProcucts,totalPricePaid);
        }
    }}

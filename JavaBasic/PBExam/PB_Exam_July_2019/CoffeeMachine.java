package PB_Exam_July_2019;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String drink = in.nextLine();
        String sugar = in.nextLine();
        int numOfDrinks = Integer.parseInt(in.nextLine());

        double price=0;

        switch (drink) {
            case "Espresso":

                if(sugar.equals("Without")){
                    price=numOfDrinks*0.90;
                    price-=price*35/100;
                }
                else  if(sugar.equals("Normal")){
                    price=numOfDrinks;
                }
                else  if(sugar.equals("Extra")){
                    price=numOfDrinks*1.20;
                }
                if(numOfDrinks>=5){
                    price-=price*25/100;
                }
                break;
            case "Cappuccino":

                if(sugar.equals("Without")){
                    price=numOfDrinks;
                    price-=price*35/100;
                }
                else  if(sugar.equals("Normal")){
                    price=numOfDrinks*1.20;
                }
                else  if(sugar.equals("Extra")){
                    price=numOfDrinks*1.60;
                }
                break;
            case "Tea":

                if(sugar.equals("Without")){
                    price=numOfDrinks*0.50;
                    price-=price*35/100;
                }
                else  if(sugar.equals("Normal")){
                    price=numOfDrinks*0.60;
                }
                else  if(sugar.equals("Extra")){
                    price=numOfDrinks*0.70;
                }
                break;
        }

        if(price>15){
            price-=price*20/100;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.",numOfDrinks,drink,price);
    }
}

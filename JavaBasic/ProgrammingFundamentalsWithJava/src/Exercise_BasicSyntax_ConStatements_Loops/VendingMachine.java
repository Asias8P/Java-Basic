package Exercise_BasicSyntax_ConStatements_Loops;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String coinsAsString = in.nextLine();

        double total = 0;


        while (!coinsAsString.equals("Start")) {
            double coins = Double.parseDouble(coinsAsString);
            total += coins;
            if (coins != 0.1 && coins != 0.2 && coins != 0.5 && coins != 1 && coins != 2) {
                System.out.printf("Cannot accept %.2f%n", coins);
                total-=coins;
            }

            coinsAsString = in.nextLine();
        }

        String product=in.nextLine();
        while (!product.equals("End")){

            if(!product.equals("Nuts")&&!product.equals("Water")&&!product.equals("Crisps")
                    &&!product.equals("Soda")&&!product.equals("Coke")){
                System.out.println("Invalid product");
            }

            if (product.equals("Nuts")){

             if(total<2){
                 System.out.println("Sorry, not enough money");
                 break;
             }
             else {
                 total=total-2;
                 System.out.printf("Purchased %s%n",product);
             }
            }
           else if (product.equals("Water")){

                if(total<0.70){
                    System.out.println("Sorry, not enough money");
                    break;
                }
                else {
                    total=total-0.70;
                    System.out.printf("Purchased %s%n",product);
                }
        }

            else if (product.equals("Crisps")){

                if(total<1.50){
                    System.out.println("Sorry, not enough money");
                    break;
                }
                else {
                    total=total-1.50;
                    System.out.printf("Purchased %s%n",product);
                }
            }
            else if (product.equals("Soda")){

                if(total<0.80){
                    System.out.println("Sorry, not enough money");
                    break;
                }
                else {
                    total=total-0.80;
                    System.out.printf("Purchased %s%n",product);
                }
            }

            else if (product.equals("Coke")){

                if(total<1){
                    System.out.println("Sorry, not enough money");
                    break;
                }
                else {
                    total=total-1;
                    System.out.printf("Purchased %s%n",product);
                }
            }
            product=in.nextLine();

    }

        System.out.printf("Change: %.2f",Math.abs(total));
}}

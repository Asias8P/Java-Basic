package PB_Exams_May2019;

import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int days = Integer.parseInt(in.nextLine());
        int hours = Integer.parseInt(in.nextLine());
        double price=0;
        double totalPrice=0;

        for (int i = 1; i <=days ; i++) {
           price=0;
            for (int j = 1; j <=hours ; j++) {

                if(i % 2==0 && j %2!=0){
                    price+=2.50;
                }
                else if(i % 2!=0 && j %2==0){
                    price+=1.25;
                }
                else {
                    price+=1;
                }

            }
            totalPrice+=price;
            System.out.printf("Day: %d - %.2f leva\n",i,price);

        }
        System.out.printf("Total: %.2f leva",totalPrice);
    }
}

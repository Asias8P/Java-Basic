package ExamPBJava;

import java.util.Scanner;

public class BraceletStand {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pocketMoney = Double.parseDouble(in.nextLine());
        double earnedMoney = Double.parseDouble(in.nextLine());
        double costs = Double.parseDouble(in.nextLine());
        double pricePrice = Double.parseDouble(in.nextLine());

        double total = 5*pocketMoney+(5*earnedMoney)-costs;
        double diff= pricePrice-total;
        if(total>=pricePrice){
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.",total);
        }
        else {
            System.out.printf("Insufficient money: %.2f BGN.",diff);
        }
    }
}

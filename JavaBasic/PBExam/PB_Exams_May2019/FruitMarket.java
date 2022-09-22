package PB_Exams_May2019;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double priceStrawberries = Double.parseDouble(in.nextLine());
        double quantityBananas = Double.parseDouble(in.nextLine());
        double quantityOranges = Double.parseDouble(in.nextLine());
        double quantityRaspberries = Double.parseDouble(in.nextLine());
        double quantityStrawberries = Double.parseDouble(in.nextLine());

        double priceRaspberries=priceStrawberries/2;
        double priceOranges= priceRaspberries-(priceRaspberries*40/100);
        double priceBananas = priceRaspberries-(priceRaspberries*80/100);


        double totalPriceStraw=quantityStrawberries*priceStrawberries;
        double totalPriceRasberries= quantityRaspberries*priceRaspberries;
        double totalPriceOranges= quantityOranges*priceOranges;
        double totalPriceBananas = quantityBananas*priceBananas;

        double totalPrice = totalPriceBananas+totalPriceOranges+totalPriceStraw+totalPriceRasberries;

        System.out.printf("%.2f",totalPrice);
    }
}

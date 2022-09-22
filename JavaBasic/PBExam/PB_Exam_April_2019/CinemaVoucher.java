package PB_Exam_April_2019;

import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int voucher = Integer.parseInt(in.nextLine());
        int price = 0;
        boolean isBudgetOver = false;
        int numTickets = 0;
        int numPurchase = 0;

        String purchase = in.nextLine();
        while (!purchase.equals("End")) {
            char purchaseAsChar1 = purchase.charAt(0);
            char purchaseAsChar2 = purchase.charAt(1);
            boolean ticketCounter = false;
            boolean purchaseCounter = false;
            if (purchase.length() > 8) {
                price = purchaseAsChar1 + purchaseAsChar2;
                ticketCounter = true;
            } else {
                price = purchaseAsChar1;
                purchaseCounter = true;
            }
            voucher -= price;
            if (voucher < 0) {
                isBudgetOver = true;
                break;
            }

            if (ticketCounter) {
                numTickets++;
            }
            if (purchaseCounter) {
                numPurchase++;
            }
            purchase = in.nextLine();


        }

        System.out.println();
        System.out.println(numTickets);
        System.out.println(numPurchase);


    }
}

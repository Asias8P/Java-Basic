package MidExam;

import java.util.Scanner;

public class computerStore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String typeCustomer = in.nextLine();
        double totalPrice = 0;


        while (!typeCustomer.equals("special") && !typeCustomer.equals("regular")) {
            double price = Double.parseDouble(typeCustomer);
            if (price < 0) {
                System.out.println("Invalid price!");
                typeCustomer = in.nextLine();
                continue;
            }
            totalPrice = totalPrice + price;


            typeCustomer = in.nextLine();
        }

        if(totalPrice==0){
            System.out.println("Invalid order!");
        }
        else {
        double tax = totalPrice*0.20;
        double totalPriceWithVAT = totalPrice+tax;
        if(typeCustomer.equals("special")){
            totalPriceWithVAT=totalPriceWithVAT*0.90;
        }
        System.out.println("Congratulations you've just bought a new computer!");

        System.out.printf("Price without taxes: %.2f$%n",totalPrice);

        System.out.printf("Taxes: %.2f$%n",tax);

        System.out.println("-----------");

        System.out.printf("Total price: %.2f$",totalPriceWithVAT);

    }}
}

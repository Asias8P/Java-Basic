package PB_Exams_May2019;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String contractTerm= in.nextLine();
        String contractType= in.nextLine();
        String mobileInternet= in.nextLine();
        int nMonts=Integer.parseInt(in.nextLine());
        double price=0;

        switch (contractType){
            case "Small":
                if(contractTerm.equals("one")){
                    price=9.98;
                }
                else {
                    price=8.58;
                }
                break;
            case "Middle":
                if(contractTerm.equals("one")){
                    price=18.99;
                }
                else {
                    price=17.09;
                }
                break;

            case "Large":
                if(contractTerm.equals("one")){
                    price=25.98;
                }
                else {
                    price=23.59;
                }
                break;

            case "ExtraLarge":
                if(contractTerm.equals("one")){
                    price=35.99;
                }
                else {
                    price=31.79;
                }
                break;
        }

        if(mobileInternet.equals("yes")){
            if(price<=10){
                price+=5.50;
            }
            else if(price<=30){
                price+=4.35;
            }
            else {

                price+=3.85;
            }
        }
        if(contractTerm.equals("two")){
            price=price-(price*3.75/100);
        }
        double totalPrice =price*nMonts;
        System.out.printf("%.2f lv.",totalPrice);
    }
}

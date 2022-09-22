package Methods.Lab;

import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String product = in.nextLine();
        int quantity=Integer.parseInt(in.nextLine());

        switch (product){
            case"water":
                water(quantity);
                break;
            case"coffee":
                coffee(quantity);
                break;
            case"snacks":
                snacks(quantity);
                break;
            case"coke":
                coke(quantity);
                break;
        }
    }

    public static void water(int quantity){
        double result=quantity*1.00;
        System.out.printf("%.2f",result);

    }
    public static void coffee(int quantity){
        double result=quantity*1.50;
        System.out.printf("%.2f",result);

    }
    public static void coke(int quantity){
        double result=quantity*1.40;
        System.out.printf("%.2f",result);

    }
    public static void snacks(int quantity){
        double result=quantity*2.00;
        System.out.printf("%.2f",result);

    }
}

package Exercise_BasicSyntax_ConStatements_Loops;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int orders = Integer.parseInt(in.nextLine());
            double price=0;
            double TotalPrice=0;
        for (int i = 1; i <=orders ; i++) {
            double pricePerCapsule = Double.parseDouble(in.nextLine());
            int days= Integer.parseInt(in.nextLine());
            int capsulesCount= Integer.parseInt(in.nextLine());
            price= days*capsulesCount*pricePerCapsule;
            TotalPrice+=price;
            System.out.printf("The price for the coffee is: $%.2f%n",price);

        }
        System.out.printf("Total: $%.2f%n",TotalPrice);
    }
}

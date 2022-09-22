import java.util.Scanner;

public class DiscountedPriceLoops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int products = Integer.parseInt(in.nextLine());
        double discount=0;
        double totalPrice=0;
        StringBuilder pr= new StringBuilder();

        for (int i = 0; i < products; i++) {
            double price = Double.parseDouble(in.nextLine());


                discount=(price*65)/100;
                totalPrice=price-discount;
                double result = Math.round(totalPrice*100)/100D;



                pr.append(result +"\n");



        }

             System.out.println(pr);
}}
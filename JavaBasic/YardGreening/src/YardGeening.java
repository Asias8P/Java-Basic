import java.util.Scanner;

public class YardGeening {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double squareKm = Double.parseDouble(input.nextLine());
        double price = squareKm*7.61;
        double discount = price*0.18;
        double total = price-discount;
        System.out.println("The final price is: " + total+" lv.");
        System.out.println("The discount is: "+ discount+" lv.");

    }
}

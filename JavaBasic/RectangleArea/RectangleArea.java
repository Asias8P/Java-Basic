import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price = Double.parseDouble(in.nextLine());
        double paid = Double.parseDouble(in.nextLine());
        double change=paid-price;

          int changeAsInt = (int)change;
    double changeAsCents= Math.round((change -changeAsInt)*100.0)/100.0;
     if (change>0){
         if (change>=1){
             System.out.printf("%d x 1 lev%n",changeAsInt);
         }

         if (changeAsCents>=0.50){
             changeAsCents =Math.round((changeAsCents-0.50)*100.0)/100.0;
             System.out.println("1 x 50 stotinki");
         }

        if (changeAsCents>=0.40){
            changeAsCents =Math.round((changeAsCents-0.40)*100.0)/100.0;
            System.out.println("2 x 20 stotinki");
        }
         if (changeAsCents>=0.20){
             changeAsCents =Math.round((changeAsCents-0.20)*100.0)/100.0;
             System.out.println("1 x 20 stotinki");
         }

         if (changeAsCents>=0.10){
             changeAsCents =Math.round((changeAsCents-0.10)*100.0)/100.0;
             System.out.println("1 x 10 stotinki");
         }
         if (changeAsCents>=0.05){
             changeAsCents =Math.round((changeAsCents-0.05)*100.0)/100.0;
             System.out.println("1 x 5 stotinki");
         }
         if (changeAsCents>=0.04){
             changeAsCents =Math.round((changeAsCents-0.04)*100.0)/100.0;
             System.out.println("2 x 2 stotinki");
         }

         if (changeAsCents>=0.02){
             changeAsCents =Math.round((changeAsCents-0.02)*100.0)/100.0;
             System.out.println("1 x 2 stotinki");
         }
         if (changeAsCents>=0.01){
             changeAsCents =Math.round((changeAsCents-0.01)*100.0)/100.0;
             System.out.println("1 x 1 stotinki");
         }

           }
    }

    }


package ExamPBJava;

import java.util.Scanner;

public class ComputerFilm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberComputers= Integer.parseInt(in.nextLine());
        double counterPurchases=0;
        int counterRating=0;
        double counterAVGrating=0;

        for (int i = 1; i <=numberComputers ; i++) {
            int ratingPurchases=Integer.parseInt(in.nextLine());
            int onesRating= ratingPurchases % 10;
            int tensAndHundreds = ratingPurchases/10;
            double purchasesAsDouble = tensAndHundreds;

            counterRating++;
            counterAVGrating+=onesRating;

            if(onesRating==2){
                purchasesAsDouble=0;
            }
            else if(onesRating==3){
                purchasesAsDouble=(purchasesAsDouble*50/100);
            }
            else if(onesRating==4){
                purchasesAsDouble=(purchasesAsDouble*70/100);
            }
            else if(onesRating==5){
                purchasesAsDouble=(purchasesAsDouble*85/100);
            }
            else if(onesRating==6){
                purchasesAsDouble=purchasesAsDouble;
            }
         counterPurchases+=purchasesAsDouble;
        }

        System.out.printf("%.2f%n",counterPurchases);
        System.out.printf("%.2f%n",counterAVGrating/counterRating);
    }
}

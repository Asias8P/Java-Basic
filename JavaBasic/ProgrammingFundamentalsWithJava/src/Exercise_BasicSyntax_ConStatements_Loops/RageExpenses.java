package Exercise_BasicSyntax_ConStatements_Loops;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lostGames = Integer.parseInt(in.nextLine());
        double headSetPrice=Double.parseDouble(in.nextLine());
        double mousePrice=Double.parseDouble(in.nextLine());
        double keyboardPrice=Double.parseDouble(in.nextLine());
        double displayPrice=Double.parseDouble(in.nextLine());
        int counter=0;
        double totalExpenses=0;
        int counterKeyboard=0;

        while (lostGames>counter){
            counter++;
            if (counter % 2==0){
                totalExpenses+=headSetPrice;

            }
            if (counter % 3==0){
                totalExpenses+=mousePrice;

            }
            if (counter % 6==0){
                counterKeyboard++;
                totalExpenses+=keyboardPrice;
                if(counterKeyboard % 2==0){
                    totalExpenses+=displayPrice;
                }

            }

        }
        System.out.printf("Rage expenses: %.2f lv.",totalExpenses);
    }
}

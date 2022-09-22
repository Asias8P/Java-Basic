package MoreExercises_BasicSyntax_ConStatements_Loops;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double balance = Double.parseDouble(in.nextLine());
        double startBalance=balance;
        String game= in.nextLine();
        boolean isOutOfMoney=false;

        while (!game.equals("Game Time")){

            if(game.equals("OutFall 4")){
                if(balance<39.99){
                    System.out.println("Too Expensive");
                    game= in.nextLine();
                    continue;
                }
                else {
                balance-=39.99;
                    System.out.printf("Bought %s%n",game);
            }}
           else if(game.equals("CS: OG")){
                if(balance<15.99){
                    System.out.println("Too Expensive");
                    game= in.nextLine();
                    continue;
                }
                else {
                balance-=15.99;
                    System.out.printf("Bought %s%n",game);
            }}
            else if(game.equals("Zplinter Zell")){
                if(balance<19.99){
                    System.out.println("Too Expensive");
                    game= in.nextLine();
                    continue;
                }
                else {
                balance-=19.99;
                    System.out.printf("Bought %s%n",game);
            }}
            else if(game.equals("Honored 2")){
                if(balance<59.99){
                    System.out.println("Too Expensive");
                    game= in.nextLine();
                    continue;
                }
                else {
                balance-=59.99;
                    System.out.printf("Bought %s%n",game);
            }}
            else if(game.equals("RoverWatch")){
                if(balance<29.99){
                    System.out.println("Too Expensive");
                    game= in.nextLine();
                    continue;
                }
                else {
                balance-=29.99;
                    System.out.printf("Bought %s%n",game);
            }}
            else if(game.equals("RoverWatch Origins Edition")){
                if(balance<39.99){
                    System.out.println("Too Expensive");
                    game= in.nextLine();
                    continue;
                }
                else {
                balance-=39.99;
                    System.out.printf("Bought %s%n",game);
            }}
            else {
                System.out.println("Not Found");
                game= in.nextLine();
                continue;
            }
            if(balance==0){
                isOutOfMoney=true;
                break;

            }

            game= in.nextLine();
        }
        if(isOutOfMoney){
            System.out.println("Out of money!");
        }
        else {
            System.out.printf("Total spent: $%.2f. ",startBalance-balance);
            System.out.printf("Remaining: $%.2f",balance);
        }
    }
}

package PBJune_2019;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalSeats= Integer.parseInt(in.nextLine());
        int counterVisitors=0;
        int money=0;
        boolean isFull=false;


        String input = in.nextLine();
        while (!input.equals("Movie time!")){
            int incomingVisitors= Integer.parseInt(input);
            counterVisitors+=incomingVisitors;
            if(counterVisitors>totalSeats){
                isFull=true;
                break;
            }
            if(incomingVisitors % 3==0){
                money+=(incomingVisitors*5)-5;
                input=in.nextLine();
              continue;
            }
            money+=incomingVisitors*5;
            input=in.nextLine();
        }
        if(isFull){
            System.out.println("The cinema is full.");
        }
        else {
            System.out.printf("There are %d seats left in the cinema.%n",totalSeats-counterVisitors);
        }
        System.out.printf("Cinema income - %d lv.\n",money);
    }
}

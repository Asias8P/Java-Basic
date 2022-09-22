package PB_Exam_July_2019;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(in.nextLine());
        double taxEntrance=Double.parseDouble(in.nextLine());
        double priceBeachChair=Double.parseDouble(in.nextLine());
        double priceUmbrella=Double.parseDouble(in.nextLine());
        double halfTeam=Math.ceil(numberOfPeople*1.00/2);
        double totalPriceUmbrellas=halfTeam*priceUmbrella;
        double peopleWithChairs=Math.ceil(numberOfPeople*1.00*75/100);
        double totalPriceChairs=peopleWithChairs*priceBeachChair;

        double total= taxEntrance*numberOfPeople+totalPriceChairs+totalPriceUmbrellas;

        System.out.printf("%.2f lv.",total);


    }
}

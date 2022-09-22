package PB_Exam_April_2019;

import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double rentForTheHall=Double.parseDouble(in.nextLine());
        double figurines = rentForTheHall-(rentForTheHall*30/100);
        double catering = figurines-(figurines*15/100);
        double sound = catering/2;
        double total = rentForTheHall+figurines+catering+sound;
        System.out.printf("%.2f",total);

    }
}

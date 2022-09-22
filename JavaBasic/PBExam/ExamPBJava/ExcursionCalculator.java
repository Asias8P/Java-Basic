package ExamPBJava;

import java.util.Scanner;

public class ExcursionCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfPeople = Integer.parseInt(in.nextLine());
        String season = in.nextLine();
       double price=0;

        switch (season) {
            case "spring":
                if(numOfPeople<=5){
                    price=numOfPeople*50;
                }
                else {
                    price=numOfPeople*48;
                }
                break;
            case "summer":
                if(numOfPeople<=5){
                    price=numOfPeople*48.50;
                }
                else {
                    price=numOfPeople*45;
                }
                price=price-(price*15/100);
                break;
            case "autumn":
                if(numOfPeople<=5){
                    price=numOfPeople*60;
                }
                else {
                    price=numOfPeople*49.50;
                }
                break;
            case "winter":
                if(numOfPeople<=5){
                    price=numOfPeople*86;
                }
                else {
                    price=numOfPeople*85;
                }
                price=price+(price*8/100);
                break;
        }
        System.out.printf("%.2f leva.",price);

    }
}

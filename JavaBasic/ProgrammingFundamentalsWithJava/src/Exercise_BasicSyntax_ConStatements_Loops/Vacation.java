package Exercise_BasicSyntax_ConStatements_Loops;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(in.nextLine());
        String group = in.nextLine();
        String day = in.nextLine();
        double price = 0;

        switch (day) {
            case "Friday":
                if (group.equals("Students")) {

                    price = numberOfPeople * 8.45;

                    if (numberOfPeople >= 30) {

                        price = price - (price * 15 / 100);
                    }
                }

                else if(group.equals("Business")){

                    price = numberOfPeople * 10.90;

                    if (numberOfPeople >= 100) {

                        price = (numberOfPeople-10)*10.90;
                }
                }

                else if(group.equals("Regular")){

                    price = numberOfPeople * 15;

                    if (numberOfPeople >= 10 && numberOfPeople<=20) {

                        price = price - (price * 5 / 100);
                    }
                }


                break;
            case "Saturday":

                if (group.equals("Students")) {

                    price = numberOfPeople * 9.80;

                    if (numberOfPeople >= 30) {

                        price = price - (price * 15 / 100);
                    }
                }

                else if(group.equals("Business")){

                    price = numberOfPeople * 15.60;

                    if (numberOfPeople >= 100) {

                        price = (numberOfPeople-10)*15.60;
                    }
                }

                else if(group.equals("Regular")){

                    price = numberOfPeople * 20;

                    if (numberOfPeople >= 10 && numberOfPeople<=20) {

                        price = price - (price * 5 / 100);
                    }
                }



                break;
            case "Sunday":

                if (group.equals("Students")) {

                    price = numberOfPeople * 10.46;

                    if (numberOfPeople >= 30) {

                        price = price - (price * 15 / 100);
                    }
                }

                else if(group.equals("Business")){

                    price = numberOfPeople * 16;

                    if (numberOfPeople >= 100) {

                        price = (numberOfPeople-10)*16;
                    }
                }

                else if(group.equals("Regular")){

                    price = numberOfPeople * 22.50;

                    if (numberOfPeople >= 10 && numberOfPeople<=20) {

                        price = price - (price * 5 / 100);
                    }
                }


                break;

        }

        System.out.printf("Total price: %.2f",price);
    }
}

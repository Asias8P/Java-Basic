package Exercise_BasicSyntax_ConStatements_Loops;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double availableMoney= Double.parseDouble(in.nextLine());
        int students = Integer.parseInt(in.nextLine());
        double priceLightsaber = Double.parseDouble(in.nextLine());
        double priceRobe = Double.parseDouble(in.nextLine());
        double priceBelt = Double.parseDouble(in.nextLine());

        double LighsabersNumber=Math.ceil(students+(students*10.00/100));
        double priceAllLight = LighsabersNumber*priceLightsaber;
        double priceAllRobes = students*priceRobe;
        int discountBelts=students/6;
        double priceAllbelts = (students-discountBelts)*priceBelt;

        double totalPrice=priceAllLight+priceAllRobes+priceAllbelts;
        double diff= totalPrice-availableMoney;
        if(totalPrice<=availableMoney){
            System.out.printf("The money is enough - it would cost %.2flv.",totalPrice);
        }
        else {
            System.out.printf("George Lucas will need %.2flv more.",diff);
        }





    }
}

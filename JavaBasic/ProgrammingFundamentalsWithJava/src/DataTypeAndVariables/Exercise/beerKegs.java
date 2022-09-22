package DataTypeAndVariables.Exercise;

import java.util.Scanner;

public class beerKegs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kegsNum= Integer.parseInt(in.nextLine());
        double maxVolume=Double.MIN_VALUE;
        String maxModel="";

        for (int i = 1; i <=kegsNum ; i++) {
            String model = in.nextLine();
            double radius = Double.parseDouble(in.nextLine());
            double height = Double.parseDouble(in.nextLine());

            double volume = Math.PI * Math.pow(radius,2)*height;

            if(volume>maxVolume){
                maxVolume=volume;
                maxModel=model;
            }

        }
        System.out.println(maxModel);
    }
}

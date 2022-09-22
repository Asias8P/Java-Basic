package PBMarch_019;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int annualFee= Integer.parseInt(in.nextLine());
        double shoes = annualFee-(annualFee*40*1.00/100);
        double equipment = shoes-(shoes*1.00*20/100);
        double ball = equipment/4;
        double accessories = ball/5;
                double total = annualFee+shoes+equipment+ball+accessories;
        System.out.printf("%.2f",total);
    }
}

package Lab_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class BackIn30Min {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hour = Integer.parseInt(in.nextLine());
        int min = Integer.parseInt(in.nextLine());

        int allMin= hour*60+min+30;
        int finalHour = allMin/60;
        int finalMin= allMin%60;

        if(finalHour>23){
            finalHour=0;
        }

        System.out.printf("%d:%02d",finalHour,finalMin);
    }
}

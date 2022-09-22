package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class centuriesToMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int centuries = Integer.parseInt(in.nextLine());


        double years= centuries*100;
        double days=years*365.2422;
        double hours = days*24;
        double min  = hours*60;

        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes ",centuries,years,days,hours,min);

    }
}

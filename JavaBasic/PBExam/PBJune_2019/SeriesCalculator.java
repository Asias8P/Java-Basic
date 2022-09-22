package PBJune_2019;

import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String movie= in.nextLine();
        int seasons = Integer.parseInt(in.nextLine());
        int episods = Integer.parseInt(in.nextLine());
        double episodTotalMin= Double.parseDouble(in.nextLine());

            double ep1WithAdv= episodTotalMin+(episodTotalMin*20/100);
            double totalEpsTime= episods*ep1WithAdv;

            double totalTime= seasons*totalEpsTime+(seasons*10);

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.",movie,totalTime);
    }
}

import java.sql.SQLClientInfoException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//              int metres = 383800;
//              int km = metres / 1000;
//              int remainingMetres = metres % 1000;
//              System.out.printf("When do you get me %d km and %d metres away from here?", km, remainingMetres);

//            int minumtes = 137;
//            int hours= minumtes/60;
//            int remainingMin = minumtes %60;
//            System.out.println(hours);
//            System.out.println(remainingMin);

        Scanner sc = new Scanner(System.in);
        String mileMetres = sc.nextLine();
       int metresInMile = Integer.parseInt(mileMetres);
       int mile = metresInMile / 1853;
       int remainingMetres=  metresInMile % 1853;
       System.out.printf("is %d miles and %d metres", mile, remainingMetres);


    }
}

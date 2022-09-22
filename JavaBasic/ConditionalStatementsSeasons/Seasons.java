pimport java.util.Locale;
import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.nextLine();
        int date = Integer.parseInt(in.nextLine());


        switch (month) {

            case "December":
            case "January":
            case "February":

                if (month.equals("December") && date<21) {
                    System.out.println("Autumn");}

                else {
                    System.out.println("Winter");}
                break;

            case "March":
            case "April":
            case "May":

                if (month.equals("March") && date<20){
                    System.out.println("Winter");}
                else {
                    System.out.println("Spring");}
                break;


            case "June":
            case "July":
            case "August":
                if (month.equals("June") && date<21){
                    System.out.println("Spring");}
                else {
                    System.out.println("Summer");}
                break;

            case "September":
            case "October":
            case "November":
                if (month.equals("September") && date<22) {
                    System.out.println("Summer");}
                else {
                    System.out.println("Autumn");}
                break;

            default:
                System.out.println();
                break;
        }

    }
}

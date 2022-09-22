import java.util.Scanner;
import java.util.SortedMap;

public class BeerTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String hour = in.nextLine();
        if (hour.length()<8){
            hour="0"+hour;
        }
        String hourSub = hour.substring(0, 2);
        String am_pm = hour.substring(6);

            if (am_pm.equals("PM")) {
                switch (hourSub) {
                    case "01":
                    case "02":
                    case "03":
                    case "04":
                    case "05":
                    case "06":
                    case "07":
                    case "08":
                    case "09":
                    case "10":
                    case "11":
                        System.out.println("beer time");
                        break;
                    default:
                        System.out.println("not beer time");}}



                else if (am_pm.equals("AM")) {
                     switch (hourSub) {
                         case "12":
                    case "01":
                    case "02":
                        System.out.println("Beer time");
                        break;

                    default:
                        System.out.println("non-beer time");

                }
            }


        }
    }

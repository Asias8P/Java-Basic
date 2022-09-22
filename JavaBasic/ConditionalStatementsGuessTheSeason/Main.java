import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.nextLine();
        String date = in.nextLine();
        int dateAsNum = Integer.parseInt(date);
       boolean springBorder = month.equals("march") && dateAsNum>20;
        boolean springBorder1 = month.equals("march") && dateAsNum<20;
        boolean summerBorder = month.equals("june") && dateAsNum>21;
        boolean autumnBorder = month.equals("september") && dateAsNum>22;
        boolean winterBorder = month.equals("december") && dateAsNum>21;

        switch (month.toLowerCase()) {
            case "april":
            case "may":
                if(springBorder){
                    System.out.println("spring");
                }
                else if(springBorder1){
                    System.out.println("winter");
                }

                System.out.println("spring");
                break;

                    case "july":
                    case "august":
                        summerBorder=true;
                        System.out.println("summer");
                        break;

                    case "october":
                    case "november":
                        autumnBorder=true;
                        System.out.println("autumn");
                        break;


                    case "january":
                    case "february":
                        winterBorder=true;
                        System.out.println("winter");
                        break;

            default:
                System.out.println("not a season");

        }



//        if (month.equals("march") && dateAsNum < 20) {
//            System.out.println("winter");
//        } else if (month.equals("march") && dateAsNum > 20) {
//            System.out.println("spring");
//        } else {
//            switch (month.toLowerCase()) {
//                case "march":
//                case "april":
//                case "may":
//                    System.out.println("spring");
//                    break;
//
//                if (month.equals("june") && dateAsNum<=20) {
//                    System.out.println("spring");
//                } else if (month.equals("june") && dateAsNum >= 20) {
//                    System.out.println("summer");
//                } else {
//                    switch (month.toLowerCase()){
//                    case "june":
//                    case "july":
//                    case "august":
//                        System.out.println("summer");
//                        break;
//                    case "september":
//                    case "october":
//                    case "november":
//                        System.out.println("autumn");
//                        break;
//                    case "december":
//                    case "january":
//                    case "february":
//                        System.out.println("winter");
//                        break;
//                }
//
//            }
//        }
    }
}
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int hh = in.nextInt();
        int mm = in.nextInt();
        String ampm;

        if (hh > 12) {
            hh = hh - 12;
            ampm = "PM";
        }
        else if (hh == 00) {
            hh = 12;
            ampm = "AM";
        }
        else if (hh == 12) {
            hh = 12;
            ampm = "PM";
        }
        else {
            ampm = "AM";
       }

        System.out.println("Time: " + hh+":"+mm+" "+ampm);



     //  int hh = Integer.parseInt(input);
//        if (hh > 12) {
//            hh = hh - 12;
//            format = "PM";
//        }
//        else if (hh == 00) {
//            hh = 12;
//            format = "AM";
//        }
//        else if (hh == 12) {
//            hh = 12;
//            format = "PM";
//        }
//        else {
//            format = "AM";
//        }

//        Scanner input = new Scanner(System.in);
//
//        String time = input.nextLine();
//
//        DateFormat sdf = new SimpleDateFormat("hh:mm aa");
//        Date d1 = sdf.parse(time);
//
//        if (d1>10:00 PM && )
//        System.out.println("Time: " + sdf.format(d1));


//        Scanner in = new Scanner(System.in);
//        String time = in.nextLine();
//
//        DateFormat sdf = new SimpleDateFormat("HH:mm:ss a");
//        Date d1 = sdf.parse(time);
//
//
//        System.out.print("Time: " + sdf.format(d1));

//            Date date = new Date();
//            String strDateFormat = "HH:mm:ss a";
//            SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
//            System.out.println(sdf.format(date));


    }
}

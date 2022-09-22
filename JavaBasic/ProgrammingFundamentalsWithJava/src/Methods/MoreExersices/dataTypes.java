package Methods.MoreExersices;

import java.util.Scanner;

public class dataTypes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String dataType = in.nextLine();
        switch (dataType){
            case"int":
                int numberInt=Integer.parseInt(in.nextLine());
                result(numberInt);
                break;
            case "real":
                double numberReal= Double.parseDouble(in.nextLine());
                result(numberReal);
                break;
            case "string":
                String text = in.nextLine();
                result(text);
                break;
        }


    }

    private static void result(String text) {
        String result = "$"+text+"$";
        System.out.println(result);
    }

    private static void result(double numberReal) {
        double result = numberReal*1.5;
        System.out.printf("%.2f",result);
    }

    private static void result(int number) {
        int result = number*2;
        System.out.println(result);
    }


}

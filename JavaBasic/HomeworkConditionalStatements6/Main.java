import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String no1= in.nextLine();
        double num1 = Double.parseDouble(no1);
        String no2 = in.nextLine();
        double num2 = Double.parseDouble(no2);
        String no3 = in.nextLine();
        double num3 = Double.parseDouble(no3);
        String no4 = in.nextLine();
        double num4 = Double.parseDouble(no4);
        String no5 = in.nextLine();
        double num5 = Double.parseDouble(no5);
        //double sum = num1+num2+num3+num4+num5;

         if (num1>num2 && num1>num3 && num1>num4 && num1>num5) {
            System.out.println(no1);
        }
        else if (num2>num1 && num2>num3 && num2>num4 && num2>num5){
            System.out.println(no2);
        }
      else if (num3>num1 && num3>num2 && num3>num4 && num3>num5) {
            System.out.println(no3);
        }
        else if (num4>num1 && num4>num2 && num4>num3 && num4>num5) {
            System.out.println(no4);
        }
        else {
            System.out.println(no5);
        }
    }
}

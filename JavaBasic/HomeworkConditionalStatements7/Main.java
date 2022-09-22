import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String no1 = in.nextLine();
        double num1 = Double.parseDouble(no1);
        String no2 = in.nextLine();
        double num2 = Double.parseDouble(no2);
        String no3 = in.nextLine();
        double num3 =Double.parseDouble(no3);

        if (num1>=num2 && num1>=num3 && num2>=num3){
            System.out.println(no1+" "+no2+" "+no3);
        }
       else if (num1>=num2 && num1>=num3 && num3>=num2){
            System.out.println(no1+" "+no3+" "+no2);
        }


        else if (num2>=num1 && num2>=num3 && num1>=num3) {
            System.out.println(no2+ " "+ no1+" "+no3);
        }
             else if (num2>=num1 && num2>=num3 && num3>=num1){
                System.out.println(no2+" "+no3+" "+no1);
        }


         else if (num3>=num1 && num3>=num2 && num1>=num2){
            System.out.println(no3+" "+no1+" "+no2);
        }
            else if (num3>=num1 && num3>=num2 && num2>=num1){
                System.out.println(no3+" "+no2+" "+no1);
            }
    }
}

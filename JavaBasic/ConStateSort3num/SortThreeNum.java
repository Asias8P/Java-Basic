import java.lang.management.ManagementFactory;
import java.util.Scanner;

public class SortThreeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = Integer.parseInt(in.nextLine());
        int num2 = Integer.parseInt(in.nextLine());
        int num3 = Integer.parseInt(in.nextLine());


        if (num1>=-1000 && num1<=1000 && num2>=-1000 && num2<=1000 && num3>=-1000 && num3<=1000){

            if (num1> num2 && num1>num3){
                if(num2>num3){
                System.out.println(num1+" "+num2+" "+num3);
            }
            else if(num2<num3){
                System.out.println(num1+" "+num3+" "+num2);
            }}
            if (num2> num1 && num2>num3){
                if(num1>num3){
                    System.out.println(num2+" "+num1+" "+num3);
            }
            else if (num1<num3){
                System.out.println(num2+" "+num3+" "+num1);
            }}
            if (num3> num1 && num3>num2){
                if(num2>num1){
                    System.out.println(num3+" "+num2+" "+num1);
                }
                else if (num1>num2){
                    System.out.println(num3+" "+num1+" "+num2);
                }}
             if (num1==num2 && num2==num3){
                System.out.println(num1+" "+num2+" "+num3);
            }

           if (num1==num2 && num3!=num2){
               if (num1>num3){
               System.out.println(num1+" "+num2+" "+num3);
           }

               else {
                   System.out.println(num3+" "+num2+" "+num1);
               }
           }
            if (num2==num3 && num3!=num1){
                if (num1>num3){
                    System.out.println(num1+" "+num2+" "+num3);
                }
                else {
                    System.out.println(num3+" "+num2+" "+num1);
                }
            }
            if (num1==num3 && num3!=num2){
                if (num2>num3){
                    System.out.println(num2+" "+num1+" "+num3);
                }

                else {
                    System.out.println(num1+" "+num3+" "+num2);
                }
            }


    }


    }
}

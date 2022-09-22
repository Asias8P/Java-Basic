import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
      int num3 = input.nextInt();
      //  int greatest = Math.max(num2,num3);


        if (num1>num2 && num1>num3) {

            System.out.println(num1+Math.max(num2,num3));
        }


        else if (num2>num1 && num2>num3) {
            System.out.println(num2+Math.max(num1,num3));
        }
         else {
            System.out.println(num3+Math.max(num1,num2));
        }


    }
}

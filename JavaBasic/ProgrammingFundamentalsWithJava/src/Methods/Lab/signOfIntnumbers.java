package Methods.Lab;

import java.util.Scanner;

public class signOfIntnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

         int num= Integer.parseInt(in.nextLine());

       signOfInteger(num);
    }

    public static void signOfInteger (int n){
        if(n>0){
            System.out.println("The number 2 is positive. ");
        }
        else if(n<0){
            System.out.println("The number -5 is negative. ");
        }
        else {
            System.out.println("The number 0 is zero. ");
        }
    }
}

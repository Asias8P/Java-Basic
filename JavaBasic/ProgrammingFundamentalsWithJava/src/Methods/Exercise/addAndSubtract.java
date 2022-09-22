package Methods.Exercise;

import java.util.Scanner;

public class addAndSubtract {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstDigit=Integer.parseInt(in.nextLine());
        int secondDigit=Integer.parseInt(in.nextLine());
        int thirdDigit=Integer.parseInt(in.nextLine());

        System.out.println(subtract(firstDigit,secondDigit,thirdDigit));
    }
    private static int sum (int first, int sec){
        int resultSum= first+sec;
        return resultSum;
    }

    private static int subtract(int first,int sec,int third){
        int resultsubtract = sum(first,sec)-third;
        return resultsubtract;
    }
}

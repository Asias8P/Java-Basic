package Methods.Lab;

import java.util.Scanner;

public class calculateRectangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lengthIn = Integer.parseInt(in.nextLine());
        int widthIn = Integer.parseInt(in.nextLine());
      // double result= recArea(lengthIn,widthIn);
        System.out.printf("%.0f",recArea(lengthIn,widthIn));
    }
    public static double recArea(double length, double width){
        return length*width;
    }
}

package Methods.MoreExersices;

import java.util.Scanner;

public class centerPoint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1=Integer.parseInt(in.nextLine());
        int y1=Integer.parseInt(in.nextLine());
        int x2=Integer.parseInt(in.nextLine());
        int y2=Integer.parseInt(in.nextLine());


        closerToTheCenterPoint(x1,y1,x2,y2);
    }

//
private static void closerToTheCenterPoint(int x1, int y1, int x2, int y2) {
// OM = √ (x M 2 + y M 2).
    double resultXY1=Math.sqrt(Math.pow(x1,2)+Math.pow(y1,2));
    double resultXY2=Math.sqrt(Math.pow(x2,2)+Math.pow(y2,2));
    if(resultXY1<resultXY2){
        System.out.printf("(%d, %d)",x1,y1);
    }
    else if(resultXY1>resultXY2){
        System.out.printf("(%d, %d)",x2,y2);
    }
    else if(resultXY1==resultXY2){

        System.out.printf("(%d, %d)",x1,y1);
    }
}
}



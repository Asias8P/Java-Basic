package Methods.MoreExersices;

import java.util.Scanner;

public class longerLine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1=Integer.parseInt(in.nextLine());
        int y1=Integer.parseInt(in.nextLine());
        int x2=Integer.parseInt(in.nextLine());
        int y2=Integer.parseInt(in.nextLine());

        int a1=Integer.parseInt(in.nextLine());
        int b1=Integer.parseInt(in.nextLine());
        int a2=Integer.parseInt(in.nextLine());
        int b2=Integer.parseInt(in.nextLine());


        longerLineMethod(x1,y1,x2,y2,a1,b1,a2,b2);
    }

    private static void longerLineMethod(int x1, int y1, int x2, int y2, int a1, int b1, int a2, int b2) {
        double resultXY = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        double resultAB = Math.sqrt(Math.pow((a1-a2),2)+Math.pow((b1-b2),2));
        if(resultXY>resultAB){
            closerToTheCenterPoint(x1,y1,x2,y2);
        }
        else if(resultXY<resultAB) {
            closerToTheCenterPoint(a1,b1,a2,b2);
        }
        else if(resultXY==resultAB){
            closerToTheCenterPoint(x1,y1,x2,y2);
        }
    }

    private static void closerToTheCenterPoint(int x1, int y1, int x2, int y2) {
// OM = √ (x M 2 + y M 2).
        double resultXY1=Math.sqrt(Math.pow(x1,2)+Math.pow(y1,2));
        double resultXY2=Math.sqrt(Math.pow(x2,2)+Math.pow(y2,2));
        if(resultXY1<resultXY2){
            System.out.printf("(%d, %d)(%d, %d)",x1,y1,x2,y2);
        }
        else if(resultXY1>resultXY2){
            System.out.printf("(%d, %d)(%d, %d)",x2,y2,x1,y1);
        }

    }
}

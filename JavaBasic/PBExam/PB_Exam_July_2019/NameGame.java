package PB_Exam_July_2019;

import java.util.Scanner;

public class NameGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int points=0;
        String winner="";
        int maxPoints=Integer.MIN_VALUE;

        while (!name.equals("Stop")){
            points=0;
            for (int i = 0; i <=name.length()-1 ; i++) {
                char letter=name.charAt(i);
                int number=Integer.parseInt(in.nextLine());
                if(number==letter){
                    points+=10;
                }
                else {
                    points+=2;
                }

            }
            if(maxPoints<=points){
                maxPoints=points;
                winner=name;
            }
            name= in.nextLine();
        }

        System.out.printf( "The winner is %s with %d points!",winner,maxPoints);;
    }
}

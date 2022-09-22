package PBMarch_019;

import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String name= in.nextLine();
        int startPoints=301;
        int points1=0;
        int counterFail=0;
        int counterSuccess=0;
        boolean isSucceed=false;

        String field= in.nextLine();
        while (!field.equals("Retire")){
            int points = Integer.parseInt(in.nextLine());
            if(field.equals("Single")){
                points1=points;
                if(points1>startPoints){
                    counterFail++;
                    field= in.nextLine();
                    continue;
                }
                startPoints-=points;

            }
            else if(field.equals("Double")){
                points1=2*points;
                if(points1>startPoints){
                    counterFail++;
                    field= in.nextLine();
                    continue;
                }
               startPoints-=(2*points);

            }
            else if(field.equals("Triple")){
                points1=3*points;
                if(points1>startPoints){
                    counterFail++;
                    field= in.nextLine();
                    continue;
                }
                startPoints-=(3*points);
            }


            counterSuccess++;
            if(startPoints==0){
                isSucceed=true;
                break;
            }

            field= in.nextLine();
        }
 if(isSucceed){
     System.out.printf("%s won the leg with %d shots.",name,counterSuccess);
 }
 else {
     System.out.printf("%s retired after %d unsuccessful shots.",name,counterFail);
 }
    }
}

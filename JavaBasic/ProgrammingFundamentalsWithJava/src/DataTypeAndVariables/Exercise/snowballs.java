package DataTypeAndVariables.Exercise;

import java.util.Scanner;

public class snowballs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nSnowballs= Integer.parseInt(in.nextLine());
        int snowballSnow =0;
        int snowballTime =0;
        int snowballQuality = 0;
        double snowballValue=0;
        double maxSnowballValue= Double.MIN_VALUE;
        int maxSnowballSnow =0;
        int maxSnowballTime =0;
        int maxSnowballQuality = 0;


        for (int i = 1; i <=nSnowballs ; i++) {
            snowballSnow = Integer.parseInt(in.nextLine());
            snowballTime = Integer.parseInt(in.nextLine());
           snowballQuality = Integer.parseInt(in.nextLine());

            //(snowballSnow / snowballTime) ^ snowballQuality
       snowballValue = Math.pow((snowballSnow*1.00/snowballTime),snowballQuality);

          if(snowballValue>maxSnowballValue){
              maxSnowballValue=snowballValue;
              maxSnowballQuality=snowballQuality;
              maxSnowballTime=snowballTime;
              maxSnowballSnow= snowballSnow;
          }

        }
        System.out.printf("%d : %d = %.0f (%d)",maxSnowballSnow,maxSnowballTime,maxSnowballValue,maxSnowballQuality);
    }
}

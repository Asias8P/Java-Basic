import java.util.Scanner;

public class BelowAndAboveAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strArr = in.nextLine().split(",");
        int [] numArr = new int[strArr.length];
        double sum = 0;
        double avg =0;
        StringBuilder aboveAVG = new StringBuilder();
        StringBuilder belowAVG= new StringBuilder();

        for (int i= 0; i<numArr.length;i++){
            numArr[i]= Integer.parseInt(strArr[i]);
          sum += numArr[i];
          avg= sum/ numArr.length;}

        for (int i =0;i< numArr.length;i++){
          if (numArr[i]<avg){

              belowAVG= belowAVG.append(numArr[i]);
              belowAVG=belowAVG.append(",");
          }
          if (numArr[i]>avg){

              aboveAVG=aboveAVG.append(numArr[i]);
              aboveAVG=aboveAVG.append(",");
          }
        }
        System.out.printf("avg: %.2f%n",avg);

        System.out.println("below: "+ belowAVG.substring(0,belowAVG.length()-1));
        System.out.println("above: "+aboveAVG.substring(0,aboveAVG.length()-1));
    }
}

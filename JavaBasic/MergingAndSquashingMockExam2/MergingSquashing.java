import java.util.Scanner;

public class MergingSquashing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int [] numArr = new int[n];
          int a,b,c,d;

      for(int i=0; i<=numArr.length-1;i++) {
          numArr[i]=in.nextInt();
      }


      for (int i=0;i<numArr.length-1;i++) {
          a = numArr[i] % 10;
          b = (numArr[i+1] / 10) % 10;

          System.out.printf("%d%d ",a,b);
      }
        System.out.println();

      for(int i = 0; i< numArr.length-1;i++){
          a = (numArr[i] / 10) % 10;
          b =(numArr[i] % 10)+((numArr[i+1] / 10) % 10);
          c= numArr[i+1]%10;


          if (b>=10){
              d=b%10;
              System.out.printf("%d%d%d ",a,d,c);
          }
          else {
          System.out.printf("%d%d%d ",a,b,c);
      }

    }
}}

import java.util.Arrays;
import java.util.Scanner;

public class RotateList {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
////        String[] arr = in.nextLine().split(",");
////        String[] rotatedArr = new String[arr.length];
////
////        int N = Integer.parseInt(in.nextLine());
////
////        if (N > arr.length) {
////            N = N - arr.length;
////        }
////
////        for (int i = N; i < arr.length; i++) {
////
////
////            System.out.print(arr[i] + ",");
////
////
////        }
////        for (int j = 0; j < N; j++) {
////            System.out.print(arr[j]);
////            if (arr[j] != arr[N-1]) {
////                System.out.print(",");
////            }
////        }

        Scanner in = new Scanner(System.in);
        String []strArr= in.nextLine().split(",");
        int [] numArr = new int[strArr.length];

        int N = Integer.parseInt(in.nextLine());


        for (int i=0; i<numArr.length;i++){
            numArr[i]=Integer.parseInt(strArr[i]);
           // System.out.print(numArr[i]+",");// original array

        }
        //System.out.println();
           for( int i =0;i<N;i++){
             //  System.out.print(numArr[i]+",");// array up to N

            int j,last;
           last = numArr[numArr.length-1];

           for(j =numArr.length-1;j>0;j--) {

               numArr[j] = numArr[j - 1];

           }
               numArr[0]=last;
             //  System.out.print(numArr[j]+",");//arr after rotation

           }

        for(int k=0; k<numArr.length; k++){
            System.out.print(numArr[k]);
            if (numArr[k]!=numArr[numArr.length-1]){
                System.out.print(",");
            }

        }
    }}
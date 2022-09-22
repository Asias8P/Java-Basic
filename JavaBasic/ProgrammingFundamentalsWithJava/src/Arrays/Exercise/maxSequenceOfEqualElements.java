package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class maxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = Arrays
                .stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int counter=1;
        int maxCounter=1;
        int startIndex=0;
        int bestIndex=0;

        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]==arr[i+1]){
               counter++;
               if(counter>maxCounter){
                   maxCounter=counter;
                   bestIndex=i;


               }

            }
            else {
                counter=1;
              //  startIndex=i;
            }

        }
        for (int i = bestIndex+1; i >bestIndex+1-maxCounter ; i--) {
            System.out.print(arr[i]+" ");

        }
    }
}

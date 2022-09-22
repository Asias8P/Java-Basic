package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class maxSequence_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] arr = Arrays
                .stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int bestIndex=0;
        int maxCounter=0;
        int counter=1;

        for (int i = 1; i < arr.length; i++) {

            if(arr[i]==arr[i-1]){
                counter++;
                if(counter>maxCounter){
                    maxCounter=counter;
                    bestIndex=i;
                }
            }
            else {
                counter=1;
            }

        }
        for (int i = bestIndex; i >bestIndex-maxCounter ; i--) {
            System.out.print(arr[i]+" ");
        }

    }
}

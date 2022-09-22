package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = Arrays
                .stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();



        for (int i = 0; i <arr.length ; i++) {
            int currentElement=arr[i];
            boolean isBigger=true;
            for (int j = i+1; j <arr.length ; j++) {

            if(currentElement<=arr[j]){
                isBigger=false;
                break;
            }

            }
            if(isBigger){
            System.out.print(arr[i]+" ");}

        }
    }
}

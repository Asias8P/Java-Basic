package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class magicSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = Arrays
                .stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j <=arr.length-1 ; j++) {

                if(arr[i]+arr[j]==n){
                    System.out.print(arr[i]+" ");
                    System.out.print(arr[j]+" ");
                    System.out.println();
                }

            }


        }
    }
}

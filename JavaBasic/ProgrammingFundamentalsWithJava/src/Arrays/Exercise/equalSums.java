package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class equalSums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] arr = Arrays
                .stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        boolean isEqual = false;

        for (int i = 0; i < arr.length; i++) {

            int leftSum=0;
            int rightSum=0;

            int currentEl = arr[i];

            for (int j = i+1; j <arr.length ; j++) {
                rightSum+=arr[j];
            }

            for (int k = i-1; k>=0 ; k--) {
                leftSum+=arr[k];

            }

            if(leftSum==rightSum){
                System.out.println(i);
                isEqual=true;
                break;
            }

        }
        if(!isEqual){
            System.out.println("no");
        }
    }
}

package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class arrRotation_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = in.nextLine().split(" ");

        int n = Integer.parseInt(in.nextLine());

        for (int i = 0; i < n; i++) {

            String oldElement = arr[0];

            for (int j = 0; j <arr.length-1 ; j++) {

            arr[j] = arr[j+1];}


            arr[arr.length - 1] = oldElement;

        }
        System.out.print(String.join(" ", arr));

    }
}


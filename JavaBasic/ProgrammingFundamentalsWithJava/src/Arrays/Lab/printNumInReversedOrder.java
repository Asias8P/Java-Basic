package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class printNumInReversedOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int n = Integer.parseInt(in.nextLine());
        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=Integer.parseInt(in.nextLine());

        }
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");

        }

    }
}

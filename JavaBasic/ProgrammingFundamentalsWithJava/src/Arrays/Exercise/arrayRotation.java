package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class arrayRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] arr = Arrays
                .stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = Integer.parseInt(in.nextLine());

        int [] newArr= new int[arr.length];

        if(n>arr.length){
           n=n-arr.length;
        }

        for (int i = n; i <=arr.length-1 ; i++) {
            newArr[i]=arr[i];
            System.out.print(newArr[i]+" ");
        }

        for (int i = 0; i <=n-1 ; i++) {
            newArr[i]=arr[i];
            System.out.print(newArr[i]+" ");
        }}

    }


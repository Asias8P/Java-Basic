package Arrays.Lab;

import java.util.Scanner;

public class reverseAnArrOfStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String [] arr = in.nextLine().split(" ");

        for (int n = 0; n < arr.length/2; n++) {
            String oldElement = arr[n];
            arr[n]=arr[arr.length-1-n];
            arr[arr.length-1-n]=oldElement;


        }

        System.out.println(String.join(" ",arr));
    }
}

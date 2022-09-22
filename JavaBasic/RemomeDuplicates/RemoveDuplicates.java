import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = in.nextLine().split(",");

        // String j=arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            //for (int j = 0; j < arr.length; j++) {
            if (!(arr[i].equals(arr[i+1]))) {
                System.out.print(arr[i] + ",");

            }

            else if(arr[i].equals(arr[i+1])){
                System.out.print("");
            }


            //  System.out.print(arr[arr.length-1]);
            // System.out.print(String.join(",",arrRes).replace("[","").replace("]",""));

        }
        System.out.print(arr[arr.length-1]);
    }}

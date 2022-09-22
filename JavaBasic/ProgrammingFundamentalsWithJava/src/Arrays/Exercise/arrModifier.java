package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class arrModifier {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int []arr = Arrays
                .stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = in.nextLine();

        while (!command.equals("end")){

            if(command.equals("decrease")){
                for (int i = 0; i< arr.length ; i++) {
                    arr[i]-=1;
                }
            }
            else {
            String []input = command.split(" ");
            int index1=Integer.parseInt(input[1]);
            int index2=Integer.parseInt(input[2]);
            if(command.startsWith("swap")){
               int temp= arr[index1];
                arr[index1]=arr[index2];
               arr[index2]=temp;

            }
            if(command.startsWith("multiply")){

                int multiply = arr[index1]*arr[index2];
                arr[index1]=multiply;
            }}

          command = in.nextLine();
        }

        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+", ");

        }
        System.out.print(arr[arr.length-1]);


    }
}

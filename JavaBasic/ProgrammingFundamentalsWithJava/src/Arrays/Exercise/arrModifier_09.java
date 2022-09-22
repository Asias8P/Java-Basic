package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class arrModifier_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = Arrays
                .stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = in.nextLine();

        while (!command.equals("end")) {

            String[] arrCommand = command.split(" ");

            String zeroIndexCommand = arrCommand[0];

            switch (zeroIndexCommand) {
                case "swap":
                    int index1 = Integer.parseInt(arrCommand[1]);
                    int index2 = Integer.parseInt(arrCommand[2]);
                    int element1 = arr[index1];
                    int element2 = arr[index2];
                    arr[index2] = element1;
                    arr[index1] = element2;
                    break;
                case "multiply":
                    int indexMultiiply1 = Integer.parseInt(arrCommand[1]);
                    int indexMultiyply2 = Integer.parseInt(arrCommand[2]);
                    int elementMulty1 = arr[indexMultiiply1];
                    int elementMulty2 = arr[indexMultiyply2];
                    int product = elementMulty1 * elementMulty2;
                    arr[indexMultiiply1] = product;
                    break;
                case "decrease":
                    for (int i = 0; i < arr.length; i++) {
                       arr[i]=arr[i]-1;
                    }
                    break;
            }
            command = in.nextLine();
        }

        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }

        }
    }
}

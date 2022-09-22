package Arrays.Exercise;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] arr = in.nextLine().split("\\|");

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }
    }
}

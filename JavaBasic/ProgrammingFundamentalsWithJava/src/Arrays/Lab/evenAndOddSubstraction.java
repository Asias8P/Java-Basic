package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class evenAndOddSubstraction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] arr = Arrays
                .stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sumEven=0;
        int sumOdd=0;

        for (int element:arr)
        { if(element % 2 == 0){
            sumEven+=element;
        }
        else {
            sumOdd+=element;
        }

        }
        System.out.println(sumEven-sumOdd);
    }
}

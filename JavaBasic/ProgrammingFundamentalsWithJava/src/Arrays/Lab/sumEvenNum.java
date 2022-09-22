package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class sumEvenNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] arr = Arrays
                .stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
int sum =0;
        for (int element:arr){
                if(element%2==0){
                    sum+=element;
                }

        }
        System.out.println(sum);
    }
}

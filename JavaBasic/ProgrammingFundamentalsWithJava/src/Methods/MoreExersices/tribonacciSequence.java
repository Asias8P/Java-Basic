package Methods.MoreExersices;

import java.util.Scanner;

public class tribonacciSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        tribonacciSeq(num);
    }

    private static void tribonacciSeq(int num) {
        int[] tribonacciArr = new int[num];
        if (num==1){
            tribonacciArr[0]=1;
        }
        else if(num==2){
                tribonacciArr[0] = tribonacciArr[1] = 1;
        }
        else if(num==3){
        tribonacciArr[0] = tribonacciArr[1] = 1;
        tribonacciArr[2] = 2;}

       else if (num > 3) {
            tribonacciArr[0] = tribonacciArr[1] = 1;
            tribonacciArr[2] = 2;

            for (int i = 3; i < tribonacciArr.length; i++) {
                tribonacciArr[i] = tribonacciArr[i - 1] + tribonacciArr[i - 2] + tribonacciArr[i - 3];
            }
        }
//        for (int tribonacci:tribonacciArr) {
//            System.out.print(tribonacci+" ");
//
//        }
        for (int i = 0; i < tribonacciArr.length; i++) {
            System.out.print(tribonacciArr[i] + " ");

        }

    }
}

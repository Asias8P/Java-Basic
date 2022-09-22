package Arrays.MoreExercises;

import java.util.Scanner;

public class recursiveFibonachi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        int[] numN_1 = new int[n - 1];
        int[] numN_2 = new int[n - 2];


        for (int i = 0; i <= n - 3; i++) {
            if (i == 0) {
                numN_2[0] = 1;
            } else if (i == 1) {
                numN_2[1] = 1;
            } else {
                numN_2[i] = numN_2[i - 2] + numN_2[i - 1];

            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (i <= numN_2.length - 1) {
                numN_1[i] = numN_2[i];
            }
            if (i == n - 2) {
                numN_1[i] = numN_2[n - 4] + numN_2[n - 3];
            }
        }


        int fib = numN_1[numN_1.length - 1] + numN_2[numN_2.length - 1];
        System.out.println(fib);

    }
}

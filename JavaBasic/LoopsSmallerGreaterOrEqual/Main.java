import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {

            a = in.nextInt();

            if (a > max) {
                max = a;

            }
            if (a < min) {
                min = a;

            }
//            else {
//                System.out.print("=");
//
//            }

        }

            System.out.printf("%d>", max);
            System.out.printf("%d<", min);
        }

    }


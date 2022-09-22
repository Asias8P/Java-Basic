package DrawingFigures;

import java.util.Scanner;

public class RhoumbusOfStars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for (int row = 1; row <= n; row++) {

            for (int i = 1; i <= n - row; i++) {
                System.out.print(" ");

            }

            for (int i = 1; i <= row; i++) {
                System.out.print("*");
                System.out.print(" ");

            }
            System.out.println("");
        }


        for (int row = n; row >= 1; row--) {

            for (int i = 1; i <= n - row + 1; i++) {
                System.out.print(" ");

            }

            for (int i = row - 1; i >= 1; i--) {
                System.out.print("*");
                System.out.print(" ");

            }
            System.out.println("");
        }

    }
}


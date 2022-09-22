package DrawingFigures;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        for (int i = 0; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }


            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.print(" | ");

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");}

            System.out.println();

        }

    }
}

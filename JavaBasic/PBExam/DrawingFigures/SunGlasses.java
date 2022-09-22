package DrawingFigures;

import java.util.Scanner;

public class SunGlasses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());


        for (int i = 1; i <= 2 * n; i++) {
            System.out.print("*");
        }

        for (int j = 1; j <= n; j++) {
            System.out.print(" ");
        }

        for (int i = 1; i <= 2 * n; i++) {
            System.out.print("*");

        }
        System.out.println();
        for (int k = 1; k <= n - 2; k++) {


//когато редът е (n-1) / 2 - 1, печатайте n вертикални черти вместо n интервала
            if (k == (n - 1) / 2) {
                //  звездичка; 2*n-2 наклонени черти; звездичка; n интервала; звездичка; 2*n-2 наклонени черти; звездичка
                System.out.print("*");
                for (int j = 1; j <= 2 * n - 2; j++) {
                    System.out.print("/");
                }
                System.out.print("*");

                for (int j = 1; j <= n; j++) {
                    System.out.print("|");
                }
                System.out.print("*");

                for (int j = 1; j <= 2 * n - 2; j++) {
                    System.out.print("/");
                }
                System.out.print("*");
                System.out.println();
            } else {

                //  звездичка; 2*n-2 наклонени черти; звездичка; n интервала; звездичка; 2*n-2 наклонени черти; звездичка
                System.out.print("*");
                for (int j = 1; j <= 2 * n - 2; j++) {
                    System.out.print("/");
                }
                System.out.print("*");

                for (int j = 1; j <= n; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");

                for (int j = 1; j <= 2 * n - 2; j++) {
                    System.out.print("/");
                }
                System.out.print("*");
                System.out.println();
            }

        }

        for (int i = 1; i <= 2 * n; i++) {
            System.out.print("*");
        }

        for (int j = 1; j <= n; j++) {
            System.out.print(" ");
        }

        for (int i = 1; i <= 2 * n; i++) {
            System.out.print("*");
        }
    }
}


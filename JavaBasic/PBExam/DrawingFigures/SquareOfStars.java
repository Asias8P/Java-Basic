package DrawingFigures;

import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= Integer.parseInt(in.nextLine());
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}

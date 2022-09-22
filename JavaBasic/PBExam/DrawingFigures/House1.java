package DrawingFigures;

import java.util.Scanner;

public class House1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String star = "*";
        int a = n;
        int b=n;

        for (int i = 1; i <= (n + 1) / 2; i++) {
            for (int j = i; j <= (n - 1) / 2; j++) {
                System.out.print("-");


            }
            if (i == 1 && n % 2 == 0) {
                star = "**";
                System.out.print(star);
            } else if (i == 1) {
                System.out.print(star);
            } else {
                star += "**";
                System.out.print(star);
            }

            for (int j = i; j <= (n - 1) / 2; j++) {
                System.out.print("-");

            }
            System.out.println();

        }
//Отпечатайте в цикъл основата на къщичката: n / 2 - 1 реда.
        for (int i = 0; i <=n/2-1 ; i++) {
            for (int j = 1; j <=n ; j++) {

            if(j==1 || j==n){
                System.out.print("|");
            }
            else {
                System.out.print("*");
            }}
            System.out.println();
        }

    }
}

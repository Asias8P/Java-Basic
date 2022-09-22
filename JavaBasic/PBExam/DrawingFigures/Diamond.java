package DrawingFigures;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int a=n;
        //Първият ред съдържа отляво и отдясно точно leftRight = (n - 1) / 2 тирета
        for (int row = 1; row <n/2; row++) {


        for (int i = 1; i <=(a-1)/2 ; i++) {
            System.out.print("_");
            a--;
        }
            System.out.println();

    }
}}

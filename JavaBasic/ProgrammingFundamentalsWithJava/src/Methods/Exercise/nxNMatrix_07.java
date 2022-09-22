package Methods.Exercise;

import java.util.Scanner;

public class nxNMatrix_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        nxnMatrix(n);
    }
    private static void nxnMatrix(int number){
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number ; j++) {
                System.out.print(number+" ");

            }
            System.out.println();

        }
    }
}

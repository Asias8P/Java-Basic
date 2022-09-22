package Methods.Lab;

import java.util.Scanner;

public class printingTriangle02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        outerTriangle(n);
        reversedOuterTriangle(n);

    }
    public static void innerTriangle(int start,int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void outerTriangle(int n){

        for (int i = 1; i <=n ; i++) {
            innerTriangle(1,i);

        }

    }

    public static void reversedOuterTriangle(int n){
        for (int i = n-1; i >=1; i--) {
            innerTriangle(1,i);

        }
        System.out.println();

    }


}

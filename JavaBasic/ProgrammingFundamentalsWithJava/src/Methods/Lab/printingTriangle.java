package Methods.Lab;

import java.util.Scanner;

public class printingTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int endNum = Integer.parseInt(in.nextLine());
        firstLoop(1,endNum);
        reversedLoop(1,endNum);
    }

    public static void firstLoop(int startNum, int endNumber){
        for (int i = 1; i <=endNumber; i++) {
            secondLoop(i);


        }
    }
    public static void secondLoop(int i){
        for (int j = 1; j <=i ; j++) {
            System.out.print(j+" ");
        }
        System.out.println();
    }

    public static void reversedLoop(int start, int end){
        for (int i = end; i >= start; i--) {
           innerReversedLoop(i);

        }}
        public static void innerReversedLoop(int i){
            for (int j = 1; j <i ; j++) {
                System.out.print(j+" ");

            }
            System.out.println();

    }


}

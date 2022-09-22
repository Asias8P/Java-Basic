package NestedLoops;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = Integer.parseInt(in.nextLine());
        int counter=0;

        for (int i = 0; i <=number ; i++) {
            for (int j = 0; j <=number ; j++) {
                for (int k = 0; k <=number ; k++) {
                    if(i+j+k==number){
                        counter++;
                    }

                }

            }

        }
        System.out.printf("%d",counter);
    }
}

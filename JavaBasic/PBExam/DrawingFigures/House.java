package DrawingFigures;

import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= Integer.parseInt(in.nextLine());
        String star="*";

        for (int i = 1; i <= (n+1)/2 ; i++) {

                if(n % 2== 0){
                    for (int j = (n-1)/2; j >=1 ; j--) {
                        System.out.print("_");
                    }}
            if(n % 2!= 0){
                for (int j = (n-1)/2; j >=1 ; j--) {
                    System.out.print("_");
                }}
            //На първия си ред съдържа 1 звездичка при нечетно n или 2 звездички при четно n.
            if(i==1 && n % 2 ==0){
                star="**";
                System.out.print(star);
                for (int j = (n-1)/2; j >=1 ; j--) {
                    System.out.print("_");
                }
                System.out.println();
                continue;
            }
            else if(i==1 && n % 2!=0){
                    System.out.print(star);
                for (int j = (n-1)/2; j >=1 ; j--) {
                    System.out.print("_");
                }
                System.out.println();
                    continue;
                }

               star+="**";
                System.out.print(star);
            if(n % 2== 0){
                for (int j = (n-1)/2; j >=1 ; j--) {
                    System.out.print("_");
                }}
            if(n % 2!= 0){
                for (int j = (n-1)/2; j >=1 ; j--) {
                    System.out.print("_");
                }}

            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        for (int i=0; i<N; i++){
            for (int k=i+1; k<=N+i; k++){

                System.out.print(k+" ");
        }
            System.out.println();
    }
}}

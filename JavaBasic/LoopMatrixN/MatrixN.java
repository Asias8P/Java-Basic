import java.util.Scanner;

public class MatrixN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        for (int i = 1; i<=N;i++){

           for (int k=i;k<N+i;k++){
               System.out.print(k+" ");
           }
            System.out.println();
        }

    }
}

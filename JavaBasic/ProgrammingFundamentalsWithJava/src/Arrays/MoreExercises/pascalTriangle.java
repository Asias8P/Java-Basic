package Arrays.MoreExercises;

import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
int k=0;
        for (int i = 1; i <=n ; i++) {
            k=1;
            for (int j = 1; j <=i ; j++) {
                System.out.print(k+" ");
                k= k *(i-j)/j;
            }
            System.out.println();
        }
    }
}

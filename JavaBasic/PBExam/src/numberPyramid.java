import java.util.Scanner;

public class numberPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int k = 1;
        boolean isNumReached = false;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
                if (k > n) {
                    isNumReached = true;
                    break;
                }
            }
            if (isNumReached) {
                break;
            }

            System.out.println();
        }
    }
}

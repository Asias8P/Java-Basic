import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int newIn = in.nextInt();
            if (newIn > max) {
                max = newIn;
            }
        }
            System.out.println(max);
        }
    }

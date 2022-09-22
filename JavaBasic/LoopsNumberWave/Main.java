import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i);

        }

        for (int i = n-1; i >= 1; i--) {
            System.out.print(i);

        }

//        while(n>1){
//            n--;
//            System.out.print(n);
//        }

        }
    }

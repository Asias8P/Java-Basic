import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        int x= Integer.parseInt(in.nextLine());
        int factoriel=1;
        double sum= 0;
       // S = 1 + 1!/x + 2!/x2 + … + n!/x^n.
        for (int i =1;i<=N;i++){
            factoriel*=i;
            sum +=factoriel/Math.pow(x,i);
        }
        System.out.printf("%.5f",sum+1);
    }
}

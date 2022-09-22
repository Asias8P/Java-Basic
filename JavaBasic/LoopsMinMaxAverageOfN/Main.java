import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double sum =0;

        for (int i = 1; i <= n; i++) {
            int a = in.nextInt();

            while (i>n);
            {
                sum += a;
            }

            if(a>max){
                max =a;
            }
           if (a<min){
                min=a;
            }


        }
        System.out.printf("sum =%.0f%n",sum);
        System.out.printf("average =%.2f%n",sum/n);
        System.out.println("max = "+max);
        System.out.println("min = "+min);


}

    }

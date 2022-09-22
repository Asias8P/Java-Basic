import java.util.Scanner;

public class MinMaxAvgSum {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        int max=Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        double sum=0;
        double avg=0;
        for (int i =1;i<=N;i++){
            int number=Integer.parseInt(in.nextLine());
            if (number>max){
                max=number;
            }
            if (number<min){
                min=number;
            }
            sum+=number;

        }
        System.out.printf("Min=%d%n",min);
        System.out.printf("max=%d%n",max);
        System.out.printf("sum=%.0f%n",sum);
        System.out.printf("avg=%.2f%n",sum/N);
    }
}

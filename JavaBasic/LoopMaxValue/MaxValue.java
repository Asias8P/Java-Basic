import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        int firstMax= Integer.MIN_VALUE;
        int secondMax= Integer.MIN_VALUE;
        int thirdMax= Integer.MIN_VALUE;

        for (int i = 1; i<=N; i++){
            int number = Integer.parseInt(in.nextLine());
             if(number>firstMax){
                 thirdMax=secondMax;
                 secondMax=firstMax;
                 firstMax=number;}

            else if(number>secondMax){
             thirdMax=secondMax;
             secondMax=number;}

           else if(number>thirdMax){
                 thirdMax=number;
             }
        }
        System.out.printf("%d, %d and %d",firstMax,secondMax,thirdMax);
    }
}

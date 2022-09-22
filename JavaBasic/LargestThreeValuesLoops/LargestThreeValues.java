import java.util.Scanner;

public class LargestThreeValues {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        int max1= Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;

        for(int i = 1; i<=N;i++){
            int number= Integer.parseInt(in.nextLine());
            if(number>max1){
                max3=max2;
                max2=max1;
                max1=number;
            }

           else if (number>max2){
                max3=max2;
                max2=number;

            }
           else if (number>max3){
                max3=number;

        }

    }
        System.out.printf("%d,%d and %d",max1,max2,max3);
}}

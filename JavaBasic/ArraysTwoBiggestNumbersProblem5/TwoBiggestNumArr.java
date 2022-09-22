import java.util.Arrays;
import java.util.Scanner;

public class TwoBiggestNumArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      String[] input = sc.nextLine().split("");
      int[] inputNum = new int[input.length];

        int max= Integer.MIN_VALUE;
        int maxNext=Integer.MIN_VALUE;

        for (int i = 0; i < inputNum.length; i++) {
            inputNum[i]=Integer.parseInt(input[i]);
           if (inputNum[i] > max){
                max=inputNum[i];
     }

    }

        System.out.print(max);
        System.out.println();

        Arrays.sort(inputNum);
        for (int i = 0; i<inputNum.length-1;i++){
            if ( inputNum[i]< max && inputNum[i]>maxNext){
                maxNext=inputNum[i];
            }

        }
        System.out.print(maxNext);
}}
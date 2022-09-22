import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strArr = in.nextLine().split(",");
        int[] numArr = new int[strArr.length];
        StringBuilder zeros = new StringBuilder();

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);}
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i]!=0){
                System.out.print(numArr[i]+",");}

            else if (numArr[i]==0){
                zeros=zeros.append(numArr[i]);
                zeros=zeros.append(",");
            }

        }
        System.out.print(zeros.substring(0,zeros.length()-1));
    }
}

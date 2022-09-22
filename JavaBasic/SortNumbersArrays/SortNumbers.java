import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strArr = in.nextLine().split(", ");
        int [] numArr = new int[strArr.length];

        for (int i=0; i<numArr.length;i++){
            numArr[i]= Integer.parseInt(strArr[i]);

        }
        Arrays.sort(numArr);

        for(int j = numArr.length-1;j>=1;j--){
            System.out.printf("%d, ",numArr[j]);
        }
        System.out.print(""+numArr[0]);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class IsArrSorted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strArr= in.nextLine().split(" ");
        int[] numArr= new int[strArr.length];
          int [] sortedArr = new int[numArr.length];
        for (int i=0; i<numArr.length;i++){
            numArr[i]= Integer.parseInt(strArr[i]);
            sortedArr[i]=numArr[i];
        }
                  Arrays.sort(sortedArr);
                if (Arrays.equals(numArr,sortedArr)){
                    System.out.println("Yes");

        }
                else {
                    System.out.println("No");
                }



    }
}

import java.util.Scanner;

public class RepeatingNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[]strArr = in.nextLine().split(" ");
        int[]numArr = new int[strArr.length];

        for (int i=0; i< numArr.length;i++){
            numArr[i]= Integer.parseInt(strArr[i]);
        }
        for (int i=0; i< numArr.length;i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                if (numArr[i] == numArr[j]) {
                    System.out.println(numArr[i]);
                }
            }
        }

    }
}

import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        String[]strArr = in.nextLine().split(" ");
        int[]numArr = new int[strArr.length];

        for (int i=0; i< numArr.length;i++){
            numArr[i]= Integer.parseInt(strArr[i]);
        }
        for (int i=0; i< numArr.length;i++) {
            for (int j = i+1; j < numArr.length; j++) {

                if (numArr[i] + numArr[j] == N) {
                    System.out.println(numArr[i] + "," + numArr[j]);

                }
            }

        }
    }
}

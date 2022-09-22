import java.util.Scanner;

public class MaxSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int[] numArr = new int[arr.length];
        String[] maxSeq;

        for (int i = 0; i < arr.length; i++) {
            numArr[i] = Integer.parseInt(arr[i]);


            if (numArr[i] + 1 == numArr[i + 1]) {
                i++;
            }
        }
    }}

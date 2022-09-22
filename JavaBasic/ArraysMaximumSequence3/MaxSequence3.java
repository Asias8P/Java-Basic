import java.util.Arrays;
import java.util.Scanner;

public class MaxSequence3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] inputS = input.nextLine().split(" ");
        int[] inputNumArr = new int[inputS.length];

        for (int i = 0; i <= inputNumArr.length - 1; i++) {

            inputNumArr[i] = Integer.parseInt(inputS[i]);
        }

        int length = 1;
        int maxLength = 1;

        for (int i = 0; i < inputNumArr.length - 1; i++) {
            if (inputNumArr[i] == inputNumArr[i + 1]) {
                length ++;

         }
            else if (inputNumArr[i] != inputNumArr[i + 1]){
                length=1;
            }


            else if (length>maxLength){
                maxLength=length;
            }


            }
            System.out.println(maxLength);
        }

    }
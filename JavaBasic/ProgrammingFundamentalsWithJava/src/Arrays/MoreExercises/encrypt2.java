package Arrays.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class encrypt2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sum = "";

        StringBuilder ab = new StringBuilder();

        int n = Integer.parseInt(in.nextLine());
        String [] strArr1= new String[n];
        int[] arr = new int[n];

        for (int i = 0; i <strArr1.length; i++) {
            strArr1[i] = in.nextLine();
            int encryptSum = 0;
            int product = 0;
            int division = 0;

            int sumProduct = 0;
            int sumDivision = 0;
            for (int j = 0; j < strArr1[i].length(); j++) {
                char letter = strArr1[i].charAt(j);

                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'||
                        letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                    product = letter * strArr1[i].length();
                    sumProduct += product;
                } else {
                    division = letter / strArr1[i].length();
                    sumDivision += division;

                }

            }
            encryptSum = sumDivision + sumProduct;
            sum = sum+" "+encryptSum;



        }
         sum= sum.trim();
       // sum=ab.toString();
        String[] strAr = sum.split(" ");
        int[] newArr = new int[strAr.length];
        for (int j = 0; j < newArr.length; j++) {
            newArr[j] = Integer.parseInt(strAr[j]);
        }
        Arrays.sort(newArr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);

        }
    }
}

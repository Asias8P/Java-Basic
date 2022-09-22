package Arrays.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class encrypt3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int [] sumArr = new int[n];


        for (int i = 0; i <n ; i++) {
            String word = in.nextLine();
            int sum =0;
            for (int j = 0; j < word.length(); j++) {
            char letter = word.charAt(j);


            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'||
                    letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'){

                sum+=letter*word.length();
            }
            else {
                sum+=letter/word.length();
            }



        }
            sumArr[i]=sum;
    }
        Arrays.sort(sumArr);

        for (int i = 0; i <sumArr.length ; i++) {
            System.out.println(sumArr[i]);

        }


}}

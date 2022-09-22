package PB_Exam_July_2019;

import java.util.Locale;
import java.util.Scanner;

public class TheMostPowerfulWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String word = in.nextLine();
        double points = 0;
        double maxPoints= Double.MIN_VALUE;
        String mostPowerfulWord="";


        while (!word.equals("End of words")) {

            points=0;
            for (int i = 0; i <= word.length()-1; i++) {
              char  letter = word.charAt(i);
                // word.toLowerCase().startsWith(word,"a","e","o");
                points += letter;

            }

            if (word.charAt(0) == 97 || (word.charAt(0) == 101 || (word.charAt(0) == 105 || (word.charAt(0) == 111 || (word.charAt(0) == 117 || (word.charAt(0) == 121 || (word.charAt(0) == 65
                    || (word.charAt(0) == 69 || (word.charAt(0) == 73 || (word.charAt(0) == 79 || (word.charAt(0) == 85 || (word.charAt(0) == 89)))))))))))) {
                points *= word.length();
            }
            else {
                points=Math.floor(points/word.length());
            }
            if(maxPoints<points){
                maxPoints=points;
                mostPowerfulWord=word;
            }
            word= in.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f",mostPowerfulWord,maxPoints);
    }}

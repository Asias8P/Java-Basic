package Methods.Exercise;

import java.util.Locale;
import java.util.Scanner;

public class vowelsCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine().toLowerCase();
        countVowels(text);
    }
    private static void countVowels(String text){
           int counter=0;
        char []textAsArray = text.toCharArray();
        for (char letter:textAsArray) {
            if(letter=='a' || letter=='e'||letter=='i'||letter=='u'||letter=='o'){
             counter++;
            }

        }
        System.out.println(counter);
    }
}

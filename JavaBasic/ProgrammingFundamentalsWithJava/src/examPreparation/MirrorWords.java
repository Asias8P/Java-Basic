package examPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        Pattern pattern = Pattern.compile("(@|#)(?<first>[A-Za-z]{3,})\\1\\1(?<second>[A-Za-z]{3,})\\1");
        Matcher matcher = pattern.matcher(input);

        int counterValidPairs = 0;
        int counermirrorWords = 0;

        List<String> mirrorWords= new ArrayList<>();
        while (matcher.find()) {
            counterValidPairs++;

            String firstWord = matcher.group("first");
            String secondWord = matcher.group("second");
            StringBuilder reversedWord = new StringBuilder(secondWord);
            String reversed = reversedWord.reverse().toString();

            if (firstWord.equals(reversed)) {
                counermirrorWords++;
                mirrorWords.add(firstWord+ " <=> " +secondWord);

            }
        }

        if (counterValidPairs == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", counterValidPairs);
        }
       if(counermirrorWords>0){
           System.out.println("The mirror words are:");
           System.out.println(String.join(", ",mirrorWords));
       }

    }
}

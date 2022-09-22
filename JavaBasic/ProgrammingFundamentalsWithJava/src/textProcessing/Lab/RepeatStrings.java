package textProcessing.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> text = Arrays.stream(in.nextLine().split(" ")).collect(Collectors.toList());
        for (String word:text) {
            System.out.print(repeatedString(word,word.length()));
        }
    }

    public static String repeatedString(String text, int length){
          StringBuilder bd = new StringBuilder();
        for (int i = 0; i <length ; i++) {
            bd.append(text);

        }
        String finalText = bd.toString();
        return finalText;
    }
}

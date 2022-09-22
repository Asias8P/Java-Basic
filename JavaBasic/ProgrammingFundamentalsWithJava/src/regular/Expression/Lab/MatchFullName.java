package regular.Expression.Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        Pattern pattern = Pattern.compile("\\b(?<firstName>[A-Z][a-z]+) (?<lastName>[A-Z][a-z]+)\\b");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.print(matcher.group()+" ");
        }
    }
}

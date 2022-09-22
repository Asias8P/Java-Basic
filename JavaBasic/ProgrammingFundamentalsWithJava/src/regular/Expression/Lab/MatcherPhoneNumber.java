package regular.Expression.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherPhoneNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String regex = "\\+359([ \\-])2(?:\\1)\\d{3}(?:\\1)\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String>phones = new ArrayList<>();


        while (matcher.find()){
            phones.add(matcher.group());
        }
        System.out.println(String.join(", ",phones));
    }
}

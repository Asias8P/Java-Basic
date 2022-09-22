package regular.Expressions.Esercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String inputLine = in.nextLine();
        String validEmail = "\\b(?<user>[A-Za-z]+[.\\-_]?[A-Za-z]+)@(?<host>[A-Za-z]+\\-?[A-Za-z]+(\\.+[A-Za-z]+)+)\\b";
        Pattern pattern = Pattern.compile(validEmail);

        Matcher matcher = pattern.matcher(inputLine);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}

package examPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String locations = in.nextLine();
        Pattern pattern = Pattern.compile("(\\=|\\/)(?<destination>[A-Z]+[A-Za-z]{2,})\\1");
        Matcher matcher = pattern.matcher(locations);
        int counterLength = 0;
        List<String>destinations= new ArrayList<>();
        while (matcher.find()){

            String length = matcher.group("destination");
            counterLength+=length.length();
            destinations.add(matcher.group("destination"));

        }
        System.out.print("Destinations: ");
        System.out.println(String.join(", ",destinations));
        System.out.printf("Travel Points: %d",counterLength);

    }
}

package finalFile;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        Pattern pattern = Pattern.compile("(#|\\|)(?<name>[A-Za-z]+ ?[A-Za-z]+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]{0,10000})\\1");
        Matcher matcher = pattern.matcher(input);

        int calories = 0;
       Map<String, List<String>> mapCalories = new LinkedHashMap<>();

        while (matcher.find()) {
           // calories += Integer.parseInt(matcher.group("calories"));
           String name = matcher.group("name");
           List<String>dateAndCalories=new ArrayList<>();
           String date = matcher.group("date");
           String calo = matcher.group("calories");
           calories+=Integer.parseInt(calo);
           dateAndCalories.add(date);
           dateAndCalories.add(calo);
           mapCalories.put(name,dateAndCalories);
        }

        int days = calories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);

//        while (matcher.find()) {
//            System.out.printf("Item: %s, Best before: %s, Nutrition: %s",
//                    matcher.group("name"), matcher.group("date"), matcher.group("calories"));
//        }

        mapCalories.entrySet().forEach(entry-> System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n",
                entry.getKey(),entry.getValue().get(0),entry.getValue().get(1)));
    }
    }


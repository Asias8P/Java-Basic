package regular.Expressions.Esercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        List<String> names = Arrays.stream(name.split(", "))
                .collect(Collectors.toList());

        Map<String, Integer> nameDistance = new HashMap<>();

        String namePattern = "[A-Za-z]+";
        String distancePattern = "[0-9]";

        Pattern patternLetters = Pattern.compile(namePattern);
        Pattern patternDigits = Pattern.compile(distancePattern);

//        for (int i = 0; i < names.size(); i++) {
//            nameDistance.put(names.get(i),0);
//
//        }
        names.forEach(nam->nameDistance.put(nam,0));

        String input = in.nextLine();


        while (!input.equals("end of race")) {

            StringBuilder racerName = new StringBuilder();
            Matcher matcherLetters = patternLetters.matcher(input);

            while (matcherLetters.find()) {
                racerName.append(matcherLetters.group());
            }
            Matcher matcherDigits = patternDigits.matcher(input);
            int distance = 0;
            while (matcherDigits.find()) {
                distance += Integer.parseInt(matcherDigits.group());
            }
            String racerNameStr = racerName.toString();
            if (nameDistance.containsKey(racerNameStr)) {
                int distanceValue = nameDistance.get(racerNameStr);
                nameDistance.put(racerNameStr, distanceValue + distance);
            }

            input = in.nextLine();
        }


List<String>finalList = nameDistance.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .limit(3)
        .map(entry->entry.getKey())
        .collect(Collectors.toList());

        System.out.printf("1st place: %s%n",finalList.get(0));
        System.out.printf("2nd place: %s%n",finalList.get(1));
        System.out.printf("3rd place: %s%n",finalList.get(2));

    }
}

package regular.Expressions.Esercise;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] inputNames = input.split("\\s*,\\s*");
        String health = "[^0-9+\\-*\\/.]";
        Pattern patternHealth = Pattern.compile(health);
        String damage = "\\-?\\+?[0-9]+\\.?[0-9]*";
        Pattern patternDamage = Pattern.compile(damage);


        for (String demon : inputNames) {


            Matcher matcherHealth = patternHealth.matcher(demon);
            int symbolsSum = 0;
            while (matcherHealth.find()) {
                char healthSymbols = matcherHealth.group().charAt(0);
                symbolsSum += healthSymbols;
            }

            Matcher matcherDamage = patternDamage.matcher(demon);
            double sumDamage = 0;
            while (matcherDamage.find()) {
                sumDamage += Double.parseDouble(matcherDamage.group());
            }


            for (char symbol : demon.toCharArray()) {
                if (symbol == '/') {
                    sumDamage = sumDamage / 2;
                } else if (symbol == '*') {
                    sumDamage = sumDamage * 2;
                }

            }
            //"{demon name} - {health points} health, {damage points} damage"
            System.out.printf("%s - %d health, %.2f damage%n", demon, symbolsSum, sumDamage);

        }
    }
}


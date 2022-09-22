package regular.Expressions.Esercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Pattern pattern = Pattern.compile("%(?<name>[A-Z][a-z]+)%[^%.|$]*<(?<product>\\w+)>[^%.|$]*\\|(?<count>[0-9]+)\\|[^%.|$]*?(?<price>[0-9]+\\.?[0-9]*)\\$");
        double totalPrice = 0;
        double totalIncome = 0;

        while (!input.equals("end of shift")){
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                totalPrice=Integer.parseInt(matcher.group("count"))*Double.parseDouble(matcher.group("price"));
                totalIncome+=totalPrice;
                //System.out.println(matcher.group("name")+":"+" "+matcher.group("product")+" - "+matcher.group("price"));
                System.out.printf("%s: %s - %.2f%n",matcher.group("name"),matcher.group("product"),totalPrice);
            }


            input= in.nextLine();
        }

        System.out.printf("Total income: %.2f",totalIncome);

    }
}

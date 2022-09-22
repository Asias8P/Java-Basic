package regular.Expressions.Esercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        double totalPrice =0;
        List<String>furnitureList = new ArrayList<>();
        String REGEX = ">+(?<name>[A-Za-z]+)<+(?<price>[0-9]+.?[0-9]*)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(REGEX);



        while (!input.equals("Purchase")){


            Matcher matcher = pattern.matcher(input);
            double itemPrice = 0;
          if(matcher.find()){
              itemPrice = Double.parseDouble(matcher.group("price"))
                      *Double.parseDouble(matcher.group("quantity"));
            totalPrice+=itemPrice;
            furnitureList.add(matcher.group("name"));
            input= in.nextLine();}

          else {
              input=in.nextLine();
          }
        }


        System.out.println("Bought furniture:");
        for (String furniture:furnitureList) {
            System.out.println(furniture);
        }
        System.out.printf("Total money spend: %.2f",totalPrice);
    }
}

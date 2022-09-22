package Lists.MoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String text = in.nextLine();

        String result ="";

        for (int i = 0; i < numbers.size(); i++) {
               int subListNumbers = numbers.get(i);
            int sum = 0;
               while (subListNumbers>0){

               int lastDigit = subListNumbers % 10;
               sum+=lastDigit;
               subListNumbers=subListNumbers/10;}



                  while (sum>text.length()){
                      sum=sum-text.length();}


                  result+=text.charAt(sum);



            String symbol =""+text.charAt(sum);
        text=text.replaceFirst(symbol,"");
        }
        System.out.println(result);
    }
}

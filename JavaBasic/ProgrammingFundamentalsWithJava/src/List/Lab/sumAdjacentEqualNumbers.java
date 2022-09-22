package List.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class sumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Double>numbers = Arrays.stream(in.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        double sum = 0;

        for (int i = 0; i < numbers.size()-1 ; i++) {
            if(numbers.get(i).equals(numbers.get(i+1))){
                sum=numbers.get(i)+numbers.get(i+1);
                numbers.set(i,sum);
                numbers.remove(i+1);
                i=-1;
            }

        }
        String result = joiningElementsByDelimeter(numbers," ");
        System.out.println(result);
    }
    public static String joiningElementsByDelimeter(List<Double>nums, String delimeter){
        DecimalFormat df = new DecimalFormat("0.#");
        String output= "";
        for (Double items:nums){
            output+= df.format(items) + delimeter;
        }
        return output;
    }
}

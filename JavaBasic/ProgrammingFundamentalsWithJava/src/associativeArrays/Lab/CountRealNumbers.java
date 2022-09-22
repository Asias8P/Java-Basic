package associativeArrays.Lab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Double>listOfNumbers= Arrays.stream(in.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        Map<Double,Integer>resultMapList= new TreeMap<>();

        for (int i = 0; i < listOfNumbers.size(); i++) {
            double currentNum= listOfNumbers.get(i);
            Integer counter = resultMapList.get(currentNum);
            if(!resultMapList.containsKey(currentNum)){
                resultMapList.put(currentNum,0);
            }
                resultMapList.put(currentNum,resultMapList.get(currentNum)+1);

        }

        for (Map.Entry<Double, Integer> doubleIntegerEntry : resultMapList.entrySet()) {

            DecimalFormat df = new DecimalFormat("0.##");
            System.out.printf("%s -> %d%n",df.format(doubleIntegerEntry.getKey()), doubleIntegerEntry.getValue());
        }

    }
}

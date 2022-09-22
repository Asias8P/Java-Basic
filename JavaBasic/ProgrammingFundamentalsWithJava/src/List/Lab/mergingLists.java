package List.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class mergingLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer>firstList= Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer>secondList= Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer>resultList = new ArrayList<>();

        int firstListSize = firstList.size();
        int secondListSize = secondList.size();

        int minSize=Math.min(firstListSize,secondListSize);

        for (int i = 0; i < minSize; i++) {
            resultList.add(firstList.get(i));
            resultList.add(secondList.get(i));
        }

      if(firstListSize>secondListSize){
          resultList.addAll(firstList.subList(minSize,firstListSize));
      }
      else {
          resultList.addAll(secondList.subList(minSize,secondListSize));
      }

        for (Integer items:resultList) {
            System.out.print(items +" ");

        }
    }
}

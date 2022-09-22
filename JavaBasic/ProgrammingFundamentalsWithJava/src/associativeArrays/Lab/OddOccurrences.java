package associativeArrays.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String>word = Arrays.stream(in.nextLine().split(" "))
                .collect(Collectors.toList());

        Map<String,Integer> mapWords= new LinkedHashMap<>();


        for (String w:word) {
            w=w.toLowerCase();
           // Integer currentValue=mapWords.get(w);
            if(!mapWords.containsKey(w)){
                mapWords.put(w,0);
            }
           mapWords.put(w,mapWords.get(w)+1);
        }
List<String>resultList= new ArrayList<>();
        for (Map.Entry<String, Integer> entry : mapWords.entrySet()) {
            if(entry.getValue()%2==1){
                resultList.add(entry.getKey());

            }
        }
        System.out.println(String.join(", ",resultList));
    }
}

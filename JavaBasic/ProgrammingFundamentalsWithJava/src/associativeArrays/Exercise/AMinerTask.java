package associativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String resource = in.nextLine();


        Map<String,Integer>map=new LinkedHashMap<>();
        while (!resource.equals("stop")){
            int quantity = Integer.parseInt(in.nextLine());


          if(!map.containsKey(resource)){
              map.put(resource,quantity);
          }
          else {
             int currentQuantity = map.get(resource);
              map.put(resource,currentQuantity+quantity);
          }
          resource= in.nextLine();

        }

        map.entrySet().forEach(stringIntegerEntry -> System.out.printf("%s -> %d%n",stringIntegerEntry.getKey(),stringIntegerEntry.getValue()));
    }
}

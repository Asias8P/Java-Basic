package associativeArrays.Exercise;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        Map<String, Double> mapPrice = new LinkedHashMap<>();
        Map<String, Integer> mapQuantity = new LinkedHashMap<>();


        while (!input.equals("buy")){
            String product = input.split(" ")[0];
            double price =Double.parseDouble(input.split(" ")[1]);
            int quantity =Integer.parseInt(input.split(" ")[2]);

            if(!mapPrice.containsKey(product)){
                mapPrice.put(product,price);
                mapQuantity.put(product,quantity);
            }

            else {
               int currentQuantity=mapQuantity.get(product);
                mapPrice.put(product,price);
                mapQuantity.put(product,currentQuantity+quantity);
            }



            input=in.nextLine();
        }

        for (Map.Entry<String, Double> entry : mapPrice.entrySet()) {
            double totalPrice = mapPrice.get(entry.getKey())*mapQuantity.get(entry.getKey());
            System.out.printf("%s -> %.2f%n",entry.getKey(),totalPrice);

        }


    }
}

package associativeArrays.Exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;

import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       // String inputLine=in.nextLine();

       // String [] input = inputLine.split(" ");
     LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("shards", 0);
     map.put("fragments", 0);
        map.put("motes", 0);

     Map<String, Integer> junkMap = new LinkedHashMap<>();


        boolean gameOver = false;

        while (!gameOver) {
            String [] input = in.nextLine().split(" ");
            for (int i = 0; i < input.length - 1; i += 2) {

                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();
                //"Shards", "Fragments", and "Motes"
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
//
                        int currentQuantity = map.get(material);
                        map.put(material, currentQuantity + quantity);



                    if (map.get("shards") >= 250) {
                        gameOver = true;
                        map.put("shards", map.get("shards") - 250);
                        System.out.println("Shadowmourne obtained!");
                        break;
                    } else if (map.get("fragments") >= 250) {
                        map.put("fragments", map.get("fragments") - 250);
                        gameOver = true;
                        System.out.println("Valanyr obtained!");
                        break;
                    } else if (map.get("motes") >= 250) {
                        map.put("motes", map.get("motes") - 250);
                        gameOver = true;
                        System.out.println("Dragonwrath obtained!");
                        break;
                    }


                } else {
                    if (!junkMap.containsKey(material)) {
                        junkMap.put(material, quantity);
                    } else {
                        int currentQuantity = junkMap.get(material);
                        junkMap.put(material, currentQuantity + quantity);
                    }

                }

            }
            if(gameOver){
                break;
            }

        }

        //shards: 5
        //
        //fragments: 5
        //
        //motes: 3
        //
        //stones: 5
        //
        //leathers: 6

        map.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
        junkMap.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));

    }
}

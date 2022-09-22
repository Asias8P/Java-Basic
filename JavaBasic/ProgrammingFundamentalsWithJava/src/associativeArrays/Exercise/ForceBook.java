package associativeArrays.Exercise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        Map<String, List<String>> map = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {

            if (input.contains("|")) {
                String[] inputLine = input.split(" \\| ");
                String side = inputLine[0];
                String user = inputLine[1];

                if (!map.containsKey(side)) {
                    map.put(side, new ArrayList<>());
                }
                boolean isUserExist = false;
                for (List<String> users : map.values()) {
                    if (users.contains(user)) {
                        isUserExist = true;
                    }
                }
                if (!isUserExist) {
                    map.get(side).add(user);
                }

            }


            if (input.contains(" -> ")) {
                String[] inputLine = input.split(" -> ");
                String user = inputLine[0];
                String side = inputLine[1];

                map.entrySet().forEach(entry -> entry.getValue().remove(user));


                if (map.containsKey(side)) {
                    map.get(side).add(user);
                }
                else {
                    map.put(side,new ArrayList<>());
                    map.get(side).add(user);
                }

                System.out.printf("%s joins the %s side!%n", user, side);

            }

            input = in.nextLine();
        }

//        Side: Light, Members: 1
//
//        ! Peter
        map.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(user -> System.out.printf("! %s%n", user));
                });


//        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
//           // if(entry.getValue().size()>0){
//            System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
//
//            entry.getValue().forEach(user -> System.out.printf("! %s%n", user));
//        }


    }
}


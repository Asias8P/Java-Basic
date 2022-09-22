package associativeArrays.Lab;

import java.util.*;

public class wordSynonyms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        Map<String, List<String>> wordSynonyms = new LinkedHashMap<>();

        for (int i = 1; i <=n ; i++) {

            String word = in.nextLine();
            String synonym = in.nextLine();

            if(!wordSynonyms.containsKey(word)){
                wordSynonyms.put(word,new ArrayList<>());
            }
            wordSynonyms.get(word).add(synonym);


        }

        for (Map.Entry<String, List<String>> stringListEntry : wordSynonyms.entrySet()) {
            System.out.printf("%s - %s%n", stringListEntry.getKey(),String.join(", ",stringListEntry.getValue()));

        }

    }
}

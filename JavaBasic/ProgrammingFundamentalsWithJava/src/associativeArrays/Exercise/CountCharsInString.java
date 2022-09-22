package associativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     //  String [] text = in.nextLine().split(" ");
        String text= in.nextLine();

        Map<Character,Integer>mapCountLetters= new LinkedHashMap<>();


//        for (int i = 0; i< text.length(); i++) {
//           char txt = text.charAt(i);
//            if(txt==' '){
//                continue;
//            }
//            if(!mapCountLetters.containsKey(txt)){
//                mapCountLetters.put(txt,1);
//            }
//            else {
//                int counter = mapCountLetters.get(txt)+1;
//                mapCountLetters.put(txt,counter);
//            }
//
//        }
//        for (Map.Entry<Character, Integer> characterIntegerEntry : mapCountLetters.entrySet()) {
//            System.out.printf("%s -> %d%n",characterIntegerEntry.getKey(),characterIntegerEntry.getValue());
//
//        }

        for (char symbol:text.toCharArray()) {

            if(symbol==' '){
                continue;
            }

            if(!mapCountLetters.containsKey(symbol)){
                mapCountLetters.put(symbol,1);
            }
            else {
                int counter= mapCountLetters.get(symbol);
                mapCountLetters.put(symbol,counter+1);
            }

        }
        mapCountLetters.entrySet().forEach(entry -> System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue()));

    }
}

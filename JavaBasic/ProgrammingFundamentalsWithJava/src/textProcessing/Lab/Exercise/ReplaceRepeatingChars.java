package textProcessing.Lab.Exercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        StringBuilder text = new StringBuilder(input);

        for (int i = 0; i <=text.length() ; i++) {
            char currentSymbol = text.charAt(i);
            if(i==text.length()-1){
                break;
            }
            char nextSymbol = text.charAt(i+1);

            if(currentSymbol==nextSymbol){
                text.deleteCharAt(i+1);
                i--;
            }

        }
        System.out.println(text);

//        List<String>symbols= Arrays.stream(in.nextLine().split(""))
//                .collect(Collectors.toList());
//        int length = symbols.size();
//        for (int i = 0; i <length-1 ; i++) {
//            if(symbols.get(i).equals(symbols.get(i+1))){
//                symbols.remove(i);
//
//               length--;
//               i--;
//
//            }
//
//        }
//        for (String symbol:symbols) {
//            System.out.print(symbol);
//        }
    }
}

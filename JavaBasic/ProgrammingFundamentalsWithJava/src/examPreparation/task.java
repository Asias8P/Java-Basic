package examPreparation;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String activationKey = in.nextLine();
        String input = in.nextLine();


        while (!input.equals("Generate")) {
            String[]token =input.split(">>>");
            String command=token[0];
            String substring="";
            int startIndex = 0;
            int endIndex = 0;

            switch (command){
                case"Contains":
                //"Contains>>>{substring}"
               substring = token[1];
                if (activationKey.contains(substring)) {
                    System.out.printf("%s contains %s%n", activationKey, substring);
                } else {
                    System.out.println("Substring not found!");
                }
            break;
            //"Flip>>>Upper/Lower>>>{startIndex}>>>{endIndex}":
                case "Flip":
                String upperLower = token[1];
               startIndex = Integer.parseInt(token[2]);
               endIndex = Integer.parseInt(token[3]);
                String flippedSubstring = activationKey.substring(startIndex,endIndex);
                if (upperLower.equals("Lower")) {
                activationKey=activationKey.replace(flippedSubstring,flippedSubstring.toLowerCase());

                } else if (upperLower.equals("Upper")) {
                 activationKey=  activationKey.replace(flippedSubstring,flippedSubstring.toUpperCase());
                }
                    System.out.println(activationKey);
            break;
            //"Slice>>>{startIndex}>>>{endIndex}":
                case"Slice":
               startIndex = Integer.parseInt(token[1]);
               endIndex = Integer.parseInt(token[2]);
               String slicedSubstring=activationKey.substring(startIndex,endIndex);
              activationKey= activationKey.replace(slicedSubstring,"");
                System.out.println(activationKey);
                break;
            }

            input = in.nextLine();
        }
        System.out.printf("Your activation key is: %s%n", activationKey);
    }

}

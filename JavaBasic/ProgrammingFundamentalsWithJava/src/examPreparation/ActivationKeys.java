package examPreparation;
import java.util.Scanner;
public class ActivationKeys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String activationKey = in.nextLine();
        String input = in.nextLine();
        StringBuilder key = new StringBuilder(activationKey);



        while (!input.equals("Generate")) {
            String []token = input.split(">>>");
            String command = token[0];
            String substring="";
            int startIndex = 0;
            int endIndex =0;

            switch (command){

            case"Contains":
                //"Contains>>>{substring}"
                substring = token[1];
               if (key.toString().contains(substring)) {
                    System.out.printf("%s contains %s%n", key, substring);
                } else {
                    System.out.println("Substring not found!");
                }
               break;

//"Flip>>>Upper/Lower>>>{startIndex}>>>{endIndex}":
                case "Flip":
                String upperLower = token[1];
                startIndex = Integer.parseInt(token[2]);
                endIndex = Integer.parseInt(token[3]);
                String flippedSubstring = key.substring(startIndex,endIndex);
                    if (upperLower.equals("Lower")) {
                      //  key.replace(startIndex, endIndex, (key.substring(startIndex, endIndex)).toLowerCase());
                       key.replace(startIndex,endIndex,flippedSubstring.toLowerCase());

                    } else if (upperLower.equals("Upper")) {
                       // key.replace(startIndex, endIndex, (key.substring(startIndex, endIndex)).toUpperCase());
                       key.replace(startIndex,endIndex,flippedSubstring.toUpperCase());
                    }
                    System.out.println(key);
            break;
                  //"Slice>>>{startIndex}>>>{endIndex}":
                case "Slice":
        startIndex = Integer.parseInt(token[1]);
        endIndex = Integer.parseInt(token[2]);

                    key.delete(startIndex, endIndex);
                    System.out.println(key);
                    break;
            }
            input = in.nextLine();
        }

        System.out.printf("Your activation key is: %s%n", key);
    }

}

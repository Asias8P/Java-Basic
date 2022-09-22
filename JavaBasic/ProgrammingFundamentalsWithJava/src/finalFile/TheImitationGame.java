package finalFile;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String encryptedMessage = in.nextLine();

        String input = in.nextLine();
        while (!input.equals("Decode")){
            String [] command = input.split("\\|");
            String action = command[0];


            switch (action){


                case"Move":
                    //"Move {number of letters}":
                    int numberOfLetters =Integer.parseInt(command[1]);
                    String substring = encryptedMessage.substring(0,numberOfLetters);
                    encryptedMessage=encryptedMessage.replace(substring,"");
                    encryptedMessage=encryptedMessage+substring;
                break;
                case"Insert":
                    //"Insert {index} {value}":
                    int index =Integer.parseInt(command[1]);
                    String value = command[2];
                    String substringInsert = encryptedMessage.substring(0,index);
                    encryptedMessage=substringInsert+value+encryptedMessage.substring(index);
//                    encryptedMessage=encryptedMessage.replace(substringInsert,"");
//                    encryptedMessage=substringInsert+value+encryptedMessage;

                    break;

                case "ChangeAll":
                    //"ChangeAll {substring} {replacement}":
                    String substringChangeAll = command[1];
                    String replacement = command[2];
                    encryptedMessage = encryptedMessage.replaceAll(substringChangeAll,replacement);
                    break;

            }
            input= in.nextLine();
        }
        System.out.printf("The decrypted message is: %s",encryptedMessage);
    }
}

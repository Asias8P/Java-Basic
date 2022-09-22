package finalFile;

import java.util.Scanner;

public class TheImitationGame2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String encryptedMessage = in.nextLine();

        StringBuilder decryptedMessage = new StringBuilder(encryptedMessage);

        String input = in.nextLine();

        while (!input.equals("Decode")){

            String [] command = input.split("\\|");
            String action = command[0];

            switch (action){

                case "Move":
                    //"Move {number of letters}":
                    int numberOfLetters =Integer.parseInt(command[1]);
                    if(numberOfLetters>=0 && numberOfLetters<=decryptedMessage.length()){
                    String substring = decryptedMessage.substring(0,numberOfLetters);
                    decryptedMessage.delete(0,numberOfLetters);
                    decryptedMessage.append(substring);}
                    else {
                        break;
                    }
                    break;

                case "Insert":
                    //"Insert {index} {value}":
                    int index =Integer.parseInt(command[1]);
                    String value = command[2];
                   if(index>=0 && index<=decryptedMessage.length()){
                    decryptedMessage.insert(index,value);}
                   else {
                       break;
                   }
                    break;

                case "ChangeAll":
                    //"ChangeAll {substring} {replacement}":
                    String substringChangeAll = command[1];
                    String replacement = command[2];
                   if(decryptedMessage.toString().contains(substringChangeAll)){
               String changeAll= decryptedMessage.toString().replaceAll(substringChangeAll,replacement);
                  decryptedMessage=new StringBuilder(changeAll);}
                   else {
                       break;
                   }
                    break;

            }
            input= in.nextLine();
        }
        System.out.printf("The decrypted message is: %s",decryptedMessage.toString());
    }

}

package textProcessing.Lab.Exercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] text = in.nextLine().split(", ");
        for (int i = 0; i < text.length; i++) {
            String userName = text[i];
            if (userName.length() < 3 || userName.length()>16) {
                continue;
            }
            boolean isUserNameValid=true;
            for (int j = 0; j < userName.length(); j++) {
                char symbol = userName.charAt(j);
                if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_'){
                    isUserNameValid=false;
                    break;
                }

            }
            if(isUserNameValid){
                System.out.println(userName);
            }

        }
    }
}

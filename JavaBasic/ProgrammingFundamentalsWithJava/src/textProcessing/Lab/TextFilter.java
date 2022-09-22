package textProcessing.Lab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String []bannedWords=in.nextLine().split(", ");
        String text = in.nextLine();

        for (String banned:bannedWords) {
           text= text.replace(banned,asteriks(banned.length(),"*"));
        }
        System.out.println(text);
    }

    public static String asteriks(int length,String replacement){
        StringBuilder bd = new StringBuilder();
        for (int i = 0; i < length; i++) {
            bd.append(replacement);

        }
        return bd.toString();
    }
}

package textProcessing.Lab;

import java.util.Scanner;

public class ReversedStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
//"{word} = {reversed word}"

        while (!text.equals("end")){
            String reversed="";
            for (int i = text.length()-1; i >=0 ; i--) {
                char symbol = text.charAt(i);
                reversed+=symbol;

            }
            System.out.printf("%s = %s%n",text,reversed);
            text= in.nextLine();


        }
    }
}

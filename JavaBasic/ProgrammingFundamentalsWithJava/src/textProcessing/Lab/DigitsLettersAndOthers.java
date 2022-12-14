package textProcessing.Lab;

import java.util.Scanner;

public class DigitsLettersAndOthers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String digits="";
        String letters="";
        String others="";

        for (int i = 0; i <input.length(); i++) {
            char symbol = input.charAt(i);
            if(Character.isDigit(symbol)){
                digits+=symbol;
            }
            else if(Character.isLetter(symbol)){
                letters+=symbol;
            }
            else {
                others+=symbol;
            }

        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);
    }
}

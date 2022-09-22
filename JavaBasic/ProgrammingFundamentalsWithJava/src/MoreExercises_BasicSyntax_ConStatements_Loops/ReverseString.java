package MoreExercises_BasicSyntax_ConStatements_Loops;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word= in.nextLine();
        String reversedString="";

        for (int i = word.length()-1; i >=0 ; i--) {
            char letter=word.charAt(i);
            reversedString +=letter;
        }
        System.out.print(reversedString);
    }
}

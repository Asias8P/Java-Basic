package MoreExercises_BasicSyntax_ConStatements_Loops;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int wordLength = Integer.parseInt(in.nextLine());
        String finalWord="";

        for (int i = 0; i <= wordLength-1; i++) {
            String n = in.nextLine();
            int numberOfDigits = n.length();
            int mainDigit = Integer.parseInt(n) % 10;
            int offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) {
                offset = (mainDigit - 2) * 3 + 1;
            }
            int letterIndex = offset + numberOfDigits - 1;

            char a = 97;
            int letter = a+letterIndex;
            char let = (char)letter;
            if(mainDigit==0){
                let=32;
            }
            finalWord+=let;


            }
        System.out.print(finalWord);
        }
    }


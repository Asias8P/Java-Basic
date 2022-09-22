package textProcessing.Lab.Exercise.Ceaser;

import java.util.Scanner;

public class Cipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        for (char symbol:text.toCharArray()) {
            int symbol3=symbol+3;
            char symbolLetter =(char)symbol3;
            System.out.print(symbolLetter);
        }
    }
}

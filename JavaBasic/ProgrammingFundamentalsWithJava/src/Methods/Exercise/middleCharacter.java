package Methods.Exercise;

import java.util.Scanner;

public class middleCharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        printMiddleLetter(text);
    }
    private static void printMiddleLetter(String txt){

        char [] text= txt.toCharArray();
        if(txt.length() % 2==0){
             // int middleSymbol1=txt.charAt(txt.length()/2);
             // int middleSymbol2=txt.charAt(txt.length()/2-1);
           // System.out.println(""+middleSymbol1+middleSymbol2);
            for (int i = 0; i < text.length/2 ; i++) {
                System.out.print(text[text.length/2-1]);
                System.out.print(text[text.length/2]);
                break;
            }}
        else {
            //System.out.println(txt.charAt(txt.length()/2));
            for (int i = 0; i < text.length ; i++) {
                System.out.print(text[text.length/2]);
                break;
            }}

    }
}

package textProcessing.Lab.Exercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        StringBuilder text = new StringBuilder(input);
        int totalStrength =0;

        for (int i = 0; i <text.length() ; i++) {
            char symbol = text.charAt(i);

            if(symbol=='>'){
                String strength = text.charAt(i+1)+"";
                int strengthAsNum= Integer.parseInt(strength);
          totalStrength+=strengthAsNum;

            }
            else if(symbol!='>' && totalStrength>0){
                text.deleteCharAt(i);
                totalStrength--;
                i--;
            }

        }
        System.out.print(text);

        }
    }


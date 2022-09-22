package textProcessing.Lab.Exercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] input = in.nextLine().split(" ");
        String word1=input[0];
        String word2=input[1];

        int maxLen = Math.max(word1.length(),word2.length());
        System.out.println(sumOfCharacterCodes(word1,word2));


    }

    public static int sumOfCharacterCodes(String word1,String word2){
        int minLen= Math.min(word1.length(),word2.length());
        int multiplyResult=1;
        int totalSum=0;
        for (int i = 0; i < minLen ; i++) {
            char symbol1=word1.charAt(i);
            char symbol2=word2.charAt(i);
            multiplyResult=symbol1*symbol2;
            totalSum+=multiplyResult;
        }
        if(word1.length()>word2.length()){
        for (int i = word1.length()-1; i >=minLen ; i--) {
            char symbol= word1.charAt(i);
            totalSum+=symbol;
        }

        }else if(word2.length()>word1.length()){
            for (int i = word2.length()-1; i >=minLen ; i--) {
                char symbol= word2.charAt(i);
                totalSum+=symbol;
            }
        }
        else {
            return totalSum;
        }

return totalSum;
        }
        

}

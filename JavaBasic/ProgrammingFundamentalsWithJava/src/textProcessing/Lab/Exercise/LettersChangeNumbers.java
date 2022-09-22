package textProcessing.Lab.Exercise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] input = in.nextLine().split("\\s+");
        double totalNum=0;
        for (int i = 0; i <input.length ; i++) {
            String currentElement = input[i];

            char firstLetter = currentElement.charAt(0);
            char lastLetter = currentElement.charAt(currentElement.length()-1);
            currentElement=currentElement.substring(1,currentElement.length()-1);
            double number = Double.parseDouble(currentElement);
            if(Character.isUpperCase(firstLetter)){
                number=number/((int)firstLetter-64);

            }
            else if((Character.isLowerCase(firstLetter))){
                number=number*((int)firstLetter-96);

            }

            if(Character.isUpperCase(lastLetter)){
                number=number-((int)lastLetter-64);

            }
            else if((Character.isLowerCase(lastLetter))){
                number=number+((int)lastLetter-96);

            }
            totalNum+=number;

        }
        System.out.printf("%.2f",totalNum);
    }
}

package textProcessing.Lab.Exercise;

import java.util.Scanner;

public class LettersChangeNums_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String [] text = in.nextLine().split("\\s+");
        double totalNum=0;


        for (String code:text) {
            double number =getNumberFromTheCode(code);
            totalNum+=number;

        }
        System.out.printf("%.2f",totalNum);
    }
    public static Double getNumberFromTheCode(String code){
        char firstNum=code.charAt(0);
        char endNum=code.charAt(code.length()-1);

        double num = Double.parseDouble(code.replace(firstNum,' ').replace(endNum,' ').trim());

        if(Character.isUpperCase(firstNum)){
            int positioninAlpha =(int)firstNum-64;
            num/=positioninAlpha;
        }
        else {
            int positioninAlpha = (int) firstNum - 96;
            num *= positioninAlpha;
        }
        if(Character.isUpperCase(endNum)){
            int positioninAlpha =(int)endNum-64;
            num-=positioninAlpha;
        }
        else {
            int positioninAlpha = (int) endNum - 96;
            num += positioninAlpha;
        }

        return num;
    }
}

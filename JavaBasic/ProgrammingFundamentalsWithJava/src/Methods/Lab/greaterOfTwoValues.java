package Methods.Lab;

import java.util.Scanner;

public class greaterOfTwoValues {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String input = in.nextLine();
        switch (input){
            case "int":
                int input1=Integer.parseInt(in.nextLine());
                int input2=Integer.parseInt(in.nextLine());
                System.out.println(greaterValueInt(input1,input2));
                break;
            case "char":
                char inputchar1= in.nextLine().charAt(0);
                char inputchar2= in.nextLine().charAt(0);
                System.out.println(greaterValueChar(inputchar1,inputchar2));
                break;
            case "string":
                String in1= in.nextLine();
                String in2= in.nextLine();
                System.out.println(greaterValueString(in1,in2));
                break;
        }
    }
    private static String greaterValueString(String firstString, String secondString){
        if(firstString.compareTo(secondString)>0){
            return firstString;
        }
        else {
            return secondString;
        }
    }
    private static char greaterValueChar(char firstChar, char secondchar){
        if(firstChar>secondchar){
            return firstChar;
        }
        else {
            return secondchar;
        }
    }

    private static int greaterValueInt(int firstInt, int secondInt){
        if(firstInt>secondInt){
            return firstInt;
        }
        else {
            return secondInt;
        }
    }
}

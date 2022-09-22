import com.sun.nio.sctp.AbstractNotificationHandler;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //String inputString= in.nextLine();
        //int inputIntNum = 0;
       // double inputDoubleNum = 0;
        String reversedWord = "";
      //  boolean isNum=true;


//      if (inputString.matches("[0-9]+") || inputString.startsWith("-")){
//           inputIntNum = Integer.parseInt(inputString);
//            System.out.println(inputIntNum+1);
//        }
        if(in.hasNextInt()){
          int  inputIntNum = in.nextInt();
            System.out.println( inputIntNum+1);
        }


       else if(in.hasNextDouble()){
       double inputDoubleNum =in.nextDouble();
//            else if(inputString.matches(",")){
//            inputDoubleNum = Double.parseDouble(inputString);
            System.out.printf( "%.2f%n", inputDoubleNum+1);

        }

        else {
            String inputString= in.nextLine();
            for (int i = inputString.length() - 1; i >= 0; i--) {
                reversedWord += inputString.charAt(i);
            }
            System.out.println(reversedWord);

       }
//        String str= "Geeks", nstr="";
//        char ch;
//
//        System.out.print("Original word: ");
//        System.out.println("Geeks"); //Example word
//
//        for (int i=0; i>=str.length(); i++)
//        {
//            ch= str.charAt(i); //extracts each character
//            nstr= ch+nstr; //adds each character in front of the existing string
//        }
//        System.out.println("Reversed word: "+ nstr);
    }
}

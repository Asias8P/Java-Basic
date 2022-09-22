package Methods.Lab;

import java.util.Scanner;

public class repeatString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text=in.nextLine();
        int n = Integer.parseInt(in.nextLine());
        System.out.println(repeat(text,n));


    }

    private static String repeat(String txt, int num){

        String result="";
        for (int i = 1; i <=num ; i++) {
         result+=txt;
        }
        return result;
    }

}

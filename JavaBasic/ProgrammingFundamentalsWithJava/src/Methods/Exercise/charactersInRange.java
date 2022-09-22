package Methods.Exercise;

import java.util.Scanner;

public class charactersInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char startChar=in.nextLine().charAt(0);
        char endChar=in.nextLine().charAt(0);
        charsInRange(startChar,endChar);

    }
    private static void charsInRange(char start,char end){
        int nextvalue=start+1;
        char newStart = (char)nextvalue;
          if(start<end){
        for (char i = newStart; i <end ; i++) {
            System.out.print(i+" ");

        }}
else {
              for (int i = end+1; i <=start-1 ; i++) {
                  System.out.print((char)i+" ");

              }
          }

    }
}

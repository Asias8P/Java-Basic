package DataTypeAndVariables.Exercise;

import java.util.Scanner;

public class triplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        for (char i = 'a'; i < 'a'+n; i++) {
           // char firstLetter =(char)('a'+i);
            for (char j = 'a'; j <'a'+n; j++) {
              //  char secondLetter =(char)('a'+j);
                for (char k = 'a'; k < 'a'+n; k++) {
                  //  char thirdLetter =(char)('a'+k);
                    System.out.printf("%c%c%c%n",i,j,k);

                }

            }
            
        }
                
    }
}

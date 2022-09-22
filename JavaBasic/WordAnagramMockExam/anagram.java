import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int numOfWords = Integer.parseInt(in.nextLine());
        String[] words = new String[numOfWords];
        String[] firstWord = word.split("");
         Arrays.sort(firstWord);


        for (int i=0; i<words.length; i++){
            words[i] = in.nextLine();
        }
        for(int j=0;j<=words.length-1;j++){
         String[]splitElement=words[j].split("");
         Arrays.sort(splitElement);


            if (Arrays.equals(splitElement,firstWord)){
                System.out.println("Yes");

            }

            else {
                System.out.println("No");
            }

        }

        }

    }


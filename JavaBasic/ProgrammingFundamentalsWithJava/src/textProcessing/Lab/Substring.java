package textProcessing.Lab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String removeWord = in.nextLine();
        String word= in.nextLine();



//        while (word.contains(removeWord)){
//           word= word.replace(removeWord,"");
//
//        }
//        System.out.println(word);

        int index= word.indexOf(removeWord);

        while (index!=-1){
            word=word.replace(removeWord,"");
            index=word.indexOf(removeWord);
        }
        System.out.println(word);
    }
}

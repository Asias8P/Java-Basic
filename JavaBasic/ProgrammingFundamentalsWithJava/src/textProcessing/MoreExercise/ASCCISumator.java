package textProcessing.MoreExercise;

import java.util.Scanner;

public class ASCCISumator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char firstSymbol = in.nextLine().charAt(0);
        char secondSymbol = in.nextLine().charAt(0);
        String text = in.nextLine();
        int sum =0;
        for (int i = 0; i < text.length(); i++) {
            int symbol = (int)text.charAt(i);
            if(symbol> (int)firstSymbol && symbol< (int)secondSymbol){
                sum+=symbol;
            }

        }


        System.out.println(sum);
    }
}

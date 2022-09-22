package associativeArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] arrWords = Arrays.stream(in.nextLine().split(" "))
                .filter(e->e.length() % 2==0)
                .toArray(String[]::new);

        for (String word:arrWords) {
            System.out.println(String.join(System.lineSeparator(),word));

        }


    }
}

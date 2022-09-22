package DataTypesAndVariables.Lab;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char firstSymbol = in.nextLine().charAt(0);
        char secondSymbol = in.nextLine().charAt(0);
        char thirdSymbol = in.nextLine().charAt(0);

        System.out.printf("%c %c %c",thirdSymbol,secondSymbol,firstSymbol);
    }
}

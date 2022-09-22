package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class charsToString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char firstSymbol= in.nextLine().charAt(0);
        char secondSymbol= in.nextLine().charAt(0);
        char thirdSymbol= in.nextLine().charAt(0);

        System.out.println(""+firstSymbol+secondSymbol+thirdSymbol);
    }
}

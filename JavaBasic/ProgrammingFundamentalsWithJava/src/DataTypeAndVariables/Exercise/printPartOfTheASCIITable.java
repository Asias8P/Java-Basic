package DataTypeAndVariables.Exercise;

import java.util.Scanner;

public class printPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int firstSymbol = Integer.parseInt(in.nextLine());
        int secondSymbol = Integer.parseInt(in.nextLine());


        for (int i = firstSymbol; i <=secondSymbol ; i++) {
            System.out.print((char)i + " ");

        }
    }
}

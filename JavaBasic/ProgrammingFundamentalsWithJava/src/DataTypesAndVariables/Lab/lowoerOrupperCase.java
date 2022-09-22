package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class lowoerOrupperCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char letter= in.nextLine().charAt(0);
        if (letter>='a' && letter<='z'){
            System.out.println("lower-case");
        }
        else if (letter>='A' && letter<='Z'){
            System.out.println("upper-case");
        }
    }
}

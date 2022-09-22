package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName= in.nextLine();
        String secondName= in.nextLine();
        String delimiter= in.nextLine();

        System.out.println(firstName+delimiter+secondName);



    }
}

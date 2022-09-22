package DataTypeAndVariables.Exercise;

import java.util.Scanner;

public class IntOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstNum=Integer.parseInt(in.nextLine());
        int secondNum=Integer.parseInt(in.nextLine());
        int thirdNum=Integer.parseInt(in.nextLine());
        int forthNum=Integer.parseInt(in.nextLine());

        int intOperation= ((firstNum+secondNum)/thirdNum)*forthNum;
        System.out.println(intOperation);
    }
}

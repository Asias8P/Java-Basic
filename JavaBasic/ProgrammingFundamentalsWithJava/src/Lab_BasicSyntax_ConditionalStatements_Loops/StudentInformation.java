package Lab_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name= in.nextLine();
        int age = Integer.parseInt(in.nextLine());
        double grade = Double.parseDouble(in.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f",name,age,grade);
    }
}

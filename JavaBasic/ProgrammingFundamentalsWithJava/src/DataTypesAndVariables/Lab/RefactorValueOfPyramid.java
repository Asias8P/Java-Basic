package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class RefactorValueOfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Length: ");
        double length = Double.parseDouble(in.nextLine());
        System.out.print("Width: ");
        double width = Double.parseDouble(in.nextLine());
        System.out.print("Height: ");
        double height = Double.parseDouble(in.nextLine());

        double volume = (length*width*height)/3;

        System.out.printf("Pyramid Volume: %.2f", volume);
    }
}

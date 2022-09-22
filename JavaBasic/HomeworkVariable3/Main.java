import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        double r = Double.parseDouble(input);
        double parameter = 2*3.14*r;
        double area = 3.14*r*r;

        System.out.printf("%.2f%n%.2f",parameter,area);
    }
}

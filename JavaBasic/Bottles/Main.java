import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner firstLine = new Scanner(System.in);
        Scanner secondLine = new Scanner(System.in);

        int halfLitreBottle = Integer.parseInt(firstLine.nextLine());
        int oneLitreBottle = Integer.parseInt(secondLine.nextLine());

        double half = halfLitreBottle * 0.1;
        double one = oneLitreBottle * 0.25;
        double total = half + one;

        System.out.printf("%.2f",total);

    }
}

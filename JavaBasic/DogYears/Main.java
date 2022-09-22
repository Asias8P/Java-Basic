import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int humanYears = in.nextInt();


        if (humanYears > 0 && humanYears <= 2) {
            System.out.println(humanYears * 10);
        } else {
            System.out.println(20 + (humanYears - 2) * 4);
        }

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line1 = sc.nextLine();
        String line2 = sc.nextLine();

        double width = Double.parseDouble(line1);
        double height = Double.parseDouble(line2);
         double result = width*height;
        System.out.printf("%.2f*%.2f=",width,height);
        System.out.print(result);

    }
}

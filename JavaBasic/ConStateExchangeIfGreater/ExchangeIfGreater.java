import java.util.Scanner;

public class ExchangeIfGreater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String first = in.nextLine();
        String second= in.nextLine();
        double a = Double.parseDouble(first);
        double b = Double.parseDouble(second);

        if(a>b){
            System.out.println(second+" "+first);
        }
        else {
            System.out.println(first+" "+second);
        }

    }
}

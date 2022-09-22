import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        String input2= in.nextLine();
        Double a = Double.parseDouble(input1);
        double b = Double.parseDouble(input2);

        if (a>b){
            System.out.printf("%s %s", input2,input1);

        }
        else {
            System.out.printf("%s %s", input1,input2);

        }
    }
}

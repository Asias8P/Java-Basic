import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();
        String input3 = in.nextLine();
        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);
        double num3 = Double.parseDouble(input3);
        double bigger = Math.max(num1,num2);

        if (bigger>num3 && bigger!=num3){

            System.out.print(bigger);
        }

        else {
            System.out.print(num3);
        }

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
        int num1 = Integer.parseInt(num);
        num=input.nextLine();
        int num2 = Integer.parseInt(num);
        num= input.nextLine();
        int num3 = Integer.parseInt(num);
        System.out.println(num1+num2+num3);

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2= input.nextInt();
       int greater = Math.max(num1,num2);

        System.out.println(greater);

    }
}

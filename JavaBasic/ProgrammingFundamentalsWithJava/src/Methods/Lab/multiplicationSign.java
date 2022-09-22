package Methods.Lab;

import java.util.Scanner;

public class multiplicationSign {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = Integer.parseInt(in.nextLine());
        int num2 = Integer.parseInt(in.nextLine());
        int num3 = Integer.parseInt(in.nextLine());

        multiplication(num1, num2, num3);
    }

    private static void multiplication(int num1, int num2, int num3) {
        int count = 0;
if(num1==0 || num2==0||num3==0){
    System.out.println("zero");
}
else {
        if (num1 < 0) {
            count++;
        }
        if (num2 < 0) {
            count++;
        }
        if (num3 < 0) {
            count++;
        }
        if (count % 2 == 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }}

}


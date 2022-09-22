import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please choose a type:");
        System.out.println("1 --> int");
        System.out.println("2 --> double");
        System.out.println("3 --> string");
        Scanner in = new Scanner(System.in);
        int numInt = in.nextInt();


        switch (numInt) {
            case 1:
            System.out.print("Please enter an int: ");
            Scanner in1 = new Scanner(System.in);
            int numInt1 = in.nextInt();
            System.out.print(++numInt1);
            break;

            case 2:
            System.out.print("Please enter a double: ");
            Scanner in2 = new Scanner(System.in);
            double numDouble = in2.nextDouble();
            System.out.print(++numDouble);
            break;

            case 3:
            System.out.print("Please enter a text: ");
            Scanner in3 = new Scanner(System.in);
            String text = in3.nextLine();
            System.out.print(text + "*");
            break;

        }
    }
}
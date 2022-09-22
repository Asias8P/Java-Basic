package Methods.Lab;

import java.util.Scanner;

public class calculations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String command= in.nextLine();
        int aInput= Integer.parseInt(in.nextLine());
        int bInput= Integer.parseInt(in.nextLine());
        commandMethod(command,aInput,bInput);


    }
    public static void commandMethod(String command,int a,int b) {

        int result = 1;
        switch (command) {
            case "multiply":
                result = a * b;
                break;

            case "divide":
                result = a / b;
                break;

            case "subtract":
                result = a - b;
                System.out.println(result);
                break;

            case "add":
                result = a + b;

        }
        System.out.println(result);
    }
}
